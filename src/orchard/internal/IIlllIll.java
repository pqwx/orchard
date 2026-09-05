/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Join a world before creating a preset
 *   - Cursor stack could not be cleared
 *   - Preset directory is unavailable
 *   - Could not delete preset: 
 *   - Cursor stack is not empty
 *   -  before loading a preset
 *   - Could not save preset: 
 *   - Waiting for player
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.PotionContentsComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.potion.Potion
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.InputUtil;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIIlll;
import orchard.internal.IIIlIIlI;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIIlllIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIlIIIl;
import orchard.internal.lIIllllI;
import orchard.internal.llIlIlIl;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class IIlllIll
extends ModuleBase {
    private final IIIIIIIIl<IIIlllIl> I;
    private long l = 0L;
    private final Map<String, Boolean> II;
    private boolean Il;
    private boolean lI;
    private boolean ll;
    private long III;
    private final llIll IIl;
    private static final int IlI = 40;
    private IIIIIIlll Ill;
    private List<IIIIIIlll> lII;
    private String lIl = "";
    private String llI = "Idle";
    private static final int lll = 9;
    private boolean IIII;
    private final IIIlIlIIl IIIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Load Delay"), 75.0, 125.0, 0.0, 1000.0, 5.0).lII("ms"));
    private static final int[] IIlI;
    private static final long IIll = 3000L;
    private long IlII;
    private static final Gson IlIl;
    private static final int IllI = 36;
    public static final String Illl;
    private static String[] lIII;
    private static final String lIIl;
    private static final int[] lIlI;
    private static final String[] lIll;
    private static final Object[] llII;

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            return false;
        }
        if (minecraftClient.currentScreen instanceof InventoryScreen) {
            return true;
        }
        if (!this.lI) return false;
        if (this.I.lIl() != IIIlllIl.l) return false;
        if (minecraftClient.currentScreen != null) return false;
        return true;
    }

    private List<IIIIIIlll> lI() {
        Path path2 = this.IIllI();
        if (path2 == null || !Files.isDirectory(path2, new LinkOption[0])) {
            return List.of();
        }
        ArrayList<IIIIIIlll> arrayList = new ArrayList<IIIIIIlll>();
        try (Stream<Path> stream = Files.list(path2);){
            stream.filter(path -> path.getFileName().toString().endsWith(".json")).map(path -> this.IlllI((Path)path)).filter(iIIIIIlll -> {
                if (iIIIIIlll == null) return false;
                if (iIIIIIlll.II == null) return false;
                if (iIIIIIlll.lI == null) return false;
                return true;
            }).forEach(arrayList::add);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        arrayList.sort(Comparator.comparingLong(iIIIIIlll -> iIIIIIlll.I).reversed().thenComparing(iIIIIIlll -> this.lllIl((IIIIIIlll)iIIIIIlll), String.CASE_INSENSITIVE_ORDER));
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String IIl(IIIIIIlll iIIIIIlll) {
        InputUtil.Key key = this.IIIlII(iIIIIIlll);
        if (lIIllllI.IlIIlll(key)) {
            return "";
        }
        String string = lIIllllI.IlIl(key);
        return string;
    }

    public IIlllIll() {
        super((Object)Illl, Category.IIl, (Object)"Captures and restores inventory, hotbar, and offhand layouts.");
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Close Inventory"), true));
        this.I = this.IIlllIl(new IIIIIIIIl<IIIlllIl>(StringFactory.IIII("Open Mode"), IIIlllIl.class, IIIlllIl.Il));
        this.lII = new ArrayList<IIIIIIlll>();
        this.II = new HashMap<String, Boolean>();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> IlI(IIIIIIlll iIIIIIlll) {
        InputUtil.Key key = this.IIIlII(iIIIIIlll);
        boolean bl = lIIllllI.IlIIlll(key);
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("unknown", bl);
        linkedHashMap.put("label", bl ? "" : lIIllllI.IlIl(key));
        linkedHashMap.put("translationKey", bl ? "" : key.getTranslationKey());
        linkedHashMap.put("type", bl ? "unknown" : key.getCategory().name().toLowerCase(Locale.ROOT));
        linkedHashMap.put("code", bl ? -1 : key.getCode());
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> lII() {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("loading", this.ll);
        linkedHashMap.put("presetId", this.lIl);
        linkedHashMap.put("message", this.llI);
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        int n = !this.ll || minecraftClient == null || minecraftClient.player == null ? 0 : this.llIIl(minecraftClient.player, this.Ill);
        linkedHashMap.put("remainingMoves", n);
        return linkedHashMap;
    }

    private Map<String, Object> lIl() {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("ok", true);
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        for (IIIIIIlll iIIIIIlll : this.lI()) {
            arrayList.add(this.IlIIl(iIIIIIlll));
        }
        linkedHashMap.put("presets", arrayList);
        linkedHashMap.put("status", this.lII());
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String llI(String string) {
        String string2;
        String string3 = this.IlIll(string).toLowerCase(Locale.ROOT).replaceAll("\\s+", "-").replaceAll("[^a-z0-9_\\-]", "");
        if (string3.isBlank()) {
            string3 = "preset";
        }
        String string4 = Long.toString(System.currentTimeMillis(), 36);
        String string5 = "-";
        String string6 = string3;
        String string7 = string2 = string6 + string5 + string4;
        int n = 2;
        while (this.IIIll(string7) != null && Files.exists(this.IIIll(string7), new LinkOption[0])) {
            int n2 = n++;
            string4 = "-";
            string5 = string2;
            string7 = string5 + string4 + n2;
        }
        return string7;
    }

    private void lll() {
        this.lII = this.lI();
        this.l = System.currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIII(int n) {
        if (n < 36 || n >= 45) {
            if (n != 45) return n - 9;
            return 0;
        }
        return n - 36;
    }

    public String IIlI() {
        return this.llI;
    }

    @Override
    public int IIll() {
        return 2995;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(MinecraftClient minecraftClient) {
        if (this.lI) {
            if (minecraftClient != null && minecraftClient.getNetworkHandler() != null && minecraftClient.player != null) {
                minecraftClient.getNetworkHandler().sendPacket((Packet)new CloseHandledScreenC2SPacket(minecraftClient.player.playerScreenHandler.syncId));
            }
            this.lI = false;
        }
        if (!this.Il) {
            return;
        }
        if (minecraftClient != null && minecraftClient.currentScreen instanceof InventoryScreen) {
            minecraftClient.setScreen(null);
        }
        this.Il = false;
    }

    public Map<String, Object> IllI(String string) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIIlI(minecraftClient)) {
            throw new IllegalStateException("Join a world before creating a preset");
        }
        IIIIIIlll iIIIIIlll = this.lIII(minecraftClient.player, string);
        this.IIIIII(iIIIIIlll);
        this.lll();
        return this.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private String Illl(int n) {
        if (n >= 36 && n < 45) {
            return "hotbar";
        }
        if (n != 45) return "inventory";
        return "offhand";
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private IIIIIIlll lIII(ClientPlayerEntity clientPlayerEntity, String string) {
        String string2 = this.IlIll(string);
        if (string2.isBlank()) {
            int n = this.lI().size() + 1;
            String string3 = "Preset ";
            string2 = string3 + n;
        }
        IIIIIIlll iIIIIIlll = new IIIIIIlll();
        iIIIIIlll.l = 1;
        iIIIIIlll.Il = string2;
        iIIIIIlll.II = this.llI(string2);
        iIIIIIlll.I = System.currentTimeMillis();
        iIIIIIlll.lI = new ArrayList<IIlIlIIIl>();
        int[] nArray = IIlI;
        int n = nArray.length;
        int n2 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= n) {
                return iIIIIIlll;
            }
            int n3 = nArray[n2];
            ItemStack itemStack = this.llIlI(clientPlayerEntity, n3);
            if (itemStack.isEmpty()) continue;
            IIlIlIIIl iIlIlIIIl = new IIlIlIIIl();
            iIlIlIIIl.II = this.Illl(n3);
            iIlIlIIIl.Il = this.IIII(n3);
            iIlIlIIIl.l = n3;
            iIlIlIIIl.lI = this.lllI(itemStack);
            iIlIlIIIl.ll = this.IIIII(itemStack);
            iIlIlIIIl.I = itemStack.getName().getString();
            iIlIlIIIl.III = itemStack.getCount();
            iIIIIIlll.lI.add(iIlIlIIIl);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Map<String, Object> lIIl(String string, InputUtil.Key key) {
        String string2;
        if (lIIllllI.IlIIlll(key)) {
            string2 = null;
            return this.IIIllI(string, string2);
        }
        string2 = key.getTranslationKey();
        return this.IIIllI(string, string2);
    }

    private static void lIlI() {
        IIlllIll.lIII[0] = IIlllIll.llIll(IIlllIll.IIlIII(-849145837, 2106342412).toCharArray(), 35287L, 1713763958);
        IIlllIll.lIII[1] = IIlllIll.llIll("".toCharArray(), 98774L, -1282030371);
        IIlllIll.lIII[2] = IIlllIll.llIll(IIlllIll.IIlIII(-849145838, -587767964).toCharArray(), 92553L, -399200779);
        IIlllIll.lIII[3] = IIlllIll.llIll(IIlllIll.IIlIII(-849145839, -680258625).toCharArray(), 695L, 1640091369);
        IIlllIll.lIII[4] = IIlllIll.llIll(IIlllIll.IIlIII(-849145840, 1660037957).toCharArray(), 64064L, 421878568);
        IIlllIll.lIII[5] = IIlllIll.llIll(IIlllIll.IIlIII(-849145833, -1012109819).toCharArray(), 29116L, -1192799782);
        IIlllIll.lIII[6] = IIlllIll.llIll(IIlllIll.IIlIII(-849145834, 225067514).toCharArray(), 74354L, -417503678);
        IIlllIll.lIII[7] = IIlllIll.llIll(IIlllIll.IIlIII(-849145835, 1780055062).toCharArray(), 54103L, 1622772804);
        IIlllIll.lIII[8] = IIlllIll.llIll(IIlllIll.IIlIII(-849145836, -1946662161).toCharArray(), 58564L, -1119477556);
        IIlllIll.lIII[9] = IIlllIll.llIll(IIlllIll.IIlIII(-849145829, -1030663123).toCharArray(), 50834L, 634719303);
        IIlllIll.lIII[10] = IIlllIll.llIll(IIlllIll.IIlIII(-849145830, 784558691).toCharArray(), 51912L, 786833075);
        IIlllIll.lIII[11] = IIlllIll.llIll(IIlllIll.IIlIII(-849145831, 1748052275).toCharArray(), 48279L, 1185615501);
        IIlllIll.lIII[12] = IIlllIll.llIll(IIlllIll.IIlIII(-849145832, -501607055).toCharArray(), 2440L, -763880246);
        IIlllIll.lIII[13] = IIlllIll.llIll(IIlllIll.IIlIII(-849145825, 721752581).toCharArray(), 33218L, 1258097289);
        IIlllIll.lIII[14] = IIlllIll.llIll(IIlllIll.IIlIII(-849145826, -1444997816).toCharArray(), 81000L, -864899222);
        IIlllIll.lIII[15] = IIlllIll.llIll(IIlllIll.IIlIII(-849145827, 1233279298).toCharArray(), 30846L, 1522623569);
        IIlllIll.lIII[16] = IIlllIll.llIll(IIlllIll.IIlIII(-849145828, -530511846).toCharArray(), 46927L, 840223280);
        IIlllIll.lIII[17] = IIlllIll.llIll(IIlllIll.IIlIII(-849145853, 1139829503).toCharArray(), 57225L, -1777220044);
        IIlllIll.lIII[18] = IIlllIll.llIll(IIlllIll.IIlIII(-849145854, 906244550).toCharArray(), 9493L, 1625289375);
        IIlllIll.lIII[19] = IIlllIll.llIll(IIlllIll.IIlIII(-849145855, 20324056).toCharArray(), 27113L, -1151258282);
        IIlllIll.lIII[20] = IIlllIll.llIll(IIlllIll.IIlIII(-849145856, 1816602880).toCharArray(), 478L, -221281989);
        IIlllIll.lIII[21] = IIlllIll.llIll(IIlllIll.IIlIII(-849145849, 249717228).toCharArray(), 12519L, 2137116844);
        IIlllIll.lIII[22] = IIlllIll.llIll(IIlllIll.IIlIII(-849145850, 133121554).toCharArray(), 14669L, -16346229);
        IIlllIll.lIII[23] = IIlllIll.llIll(IIlllIll.IIlIII(-849145851, 1873024852).toCharArray(), 40235L, 743712734);
        IIlllIll.lIII[24] = IIlllIll.llIll(IIlllIll.IIlIII(-849145852, -425825273).toCharArray(), 51274L, -222061652);
        IIlllIll.lIII[25] = IIlllIll.llIll(IIlllIll.IIlIII(-849145845, 1210338813).toCharArray(), 27185L, -1651386591);
        IIlllIll.lIII[26] = IIlllIll.llIll(IIlllIll.IIlIII(-849145846, -1508806456).toCharArray(), 74998L, 2116506266);
        IIlllIll.lIII[27] = IIlllIll.llIll(IIlllIll.IIlIII(-849145847, 1398286336).toCharArray(), 94595L, -1611232918);
        IIlllIll.lIII[28] = IIlllIll.llIll(IIlllIll.IIlIII(-849145848, 1591244984).toCharArray(), 28045L, -731973770);
        IIlllIll.lIII[29] = IIlllIll.llIll(IIlllIll.IIlIII(-849145841, -1777914483).toCharArray(), 19104L, 968124738);
        IIlllIll.lIII[30] = IIlllIll.llIll(IIlllIll.IIlIII(-849145842, -318558345).toCharArray(), 16097L, 957800128);
        IIlllIll.lIII[31] = IIlllIll.llIll(IIlllIll.IIlIII(-849145843, 487804626).toCharArray(), 98434L, -605819862);
        IIlllIll.lIII[32] = IIlllIll.llIll("\u8314\u12cc\u2130\u039d".toCharArray(), 68028L, -1566397113);
        IIlllIll.lIII[33] = IIlllIll.llIll(IIlllIll.IIlIII(-849145805, -295692959).toCharArray(), 7188L, 1061628711);
        IIlllIll.lIII[34] = IIlllIll.llIll(IIlllIll.IIlIII(-849145806, 906511417).toCharArray(), 91925L, -334999407);
        IIlllIll.lIII[35] = IIlllIll.llIll(IIlllIll.IIlIII(-849145807, 1022830263).toCharArray(), 51328L, 1222012948);
        IIlllIll.lIII[36] = IIlllIll.llIll(IIlllIll.IIlIII(-849145808, 1967785171).toCharArray(), 93408L, -1926938842);
        IIlllIll.lIII[37] = IIlllIll.llIll(IIlllIll.IIlIII(-849145801, -553287930).toCharArray(), 75728L, -27028234);
        IIlllIll.lIII[38] = IIlllIll.llIll(IIlllIll.IIlIII(-849145802, 1290357280).toCharArray(), 90096L, 562562032);
        IIlllIll.lIII[39] = IIlllIll.llIll(IIlllIll.IIlIII(-849145803, -1114945951).toCharArray(), 61711L, -1728656056);
        IIlllIll.lIII[40] = IIlllIll.llIll(IIlllIll.IIlIII(-849145804, -424976298).toCharArray(), 48061L, 1704205477);
        IIlllIll.lIII[41] = IIlllIll.llIll(IIlllIll.IIlIII(-849145797, -1661066722).toCharArray(), 18939L, -1179606025);
        IIlllIll.lIII[42] = IIlllIll.llIll(IIlllIll.IIlIII(-849145798, -1514071643).toCharArray(), 60809L, 582490682);
        IIlllIll.lIII[43] = IIlllIll.llIll(IIlllIll.IIlIII(-849145799, -956421096).toCharArray(), 91663L, 1272510306);
        IIlllIll.lIII[44] = IIlllIll.llIll(IIlllIll.IIlIII(-849145800, 1577784583).toCharArray(), 4242L, 456876634);
        IIlllIll.lIII[45] = IIlllIll.llIll(IIlllIll.IIlIII(-849145793, 1258692649).toCharArray(), 16606L, -1058369846);
        IIlllIll.lIII[46] = IIlllIll.llIll(IIlllIll.IIlIII(-849145794, -1500642081).toCharArray(), 40781L, -1341374270);
        IIlllIll.lIII[47] = IIlllIll.llIll(IIlllIll.IIlIII(-849145795, -36607333).toCharArray(), 93648L, 1880445666);
        IIlllIll.lIII[48] = IIlllIll.llIll(IIlllIll.IIlIII(-849145796, -1190701316).toCharArray(), 94997L, 1593703013);
        IIlllIll.lIII[49] = IIlllIll.llIll(IIlllIll.IIlIII(-849145821, -1347524088).toCharArray(), 46188L, 1489797519);
        IIlllIll.lIII[50] = IIlllIll.llIll(IIlllIll.IIlIII(-849145822, -1543173937).toCharArray(), 53455L, -2002521817);
        IIlllIll.lIII[51] = IIlllIll.llIll(IIlllIll.IIlIII(-849145823, 1722685978).toCharArray(), 37728L, -849498156);
        IIlllIll.lIII[52] = IIlllIll.llIll(IIlllIll.IIlIII(-849145824, -2017237799).toCharArray(), 59079L, -1265231971);
        IIlllIll.lIII[53] = IIlllIll.llIll(IIlllIll.IIlIII(-849145817, 186346384).toCharArray(), 48793L, 1094276398);
        IIlllIll.lIII[54] = IIlllIll.llIll(IIlllIll.IIlIII(-849145818, -710069998).toCharArray(), 2388L, 407877185);
        IIlllIll.lIII[55] = IIlllIll.llIll(IIlllIll.IIlIII(-849145819, 1577270113).toCharArray(), 98418L, 183065463);
        IIlllIll.lIII[56] = IIlllIll.llIll(IIlllIll.IIlIII(-849145820, -456125866).toCharArray(), 46346L, 963981025);
        IIlllIll.lIII[57] = IIlllIll.llIll(IIlllIll.IIlIII(-849145813, 1882531209).toCharArray(), 59338L, 1999579258);
        IIlllIll.lIII[58] = IIlllIll.llIll(IIlllIll.IIlIII(-849145814, -1273671304).toCharArray(), 91319L, 1316224135);
        IIlllIll.lIII[59] = IIlllIll.llIll(IIlllIll.IIlIII(-849145815, -933140047).toCharArray(), 45620L, -1755388605);
        IIlllIll.lIII[60] = IIlllIll.llIll(IIlllIll.IIlIII(-849145816, 1252807855).toCharArray(), 51713L, 1799739366);
        IIlllIll.lIII[61] = IIlllIll.llIll(IIlllIll.IIlIII(-849145809, -2101841372).toCharArray(), 93312L, 1648641672);
        IIlllIll.lIII[62] = IIlllIll.llIll(IIlllIll.IIlIII(-849145810, -1419091797).toCharArray(), 26655L, -1376615572);
        IIlllIll.lIII[63] = IIlllIll.llIll(IIlllIll.IIlIII(-849145811, -1838919875).toCharArray(), 89427L, 560879412);
        IIlllIll.lIII[64] = IIlllIll.llIll(IIlllIll.IIlIII(-849145812, 577459677).toCharArray(), 21951L, -76491229);
        IIlllIll.lIII[65] = IIlllIll.llIll(IIlllIll.IIlIII(-849145773, -1392574458).toCharArray(), 9318L, 1235463770);
        IIlllIll.lIII[66] = IIlllIll.llIll(IIlllIll.IIlIII(-849145774, 251199730).toCharArray(), 63940L, -630160473);
        IIlllIll.lIII[67] = IIlllIll.llIll(IIlllIll.IIlIII(-849145775, -430215918).toCharArray(), 68488L, 468386350);
        IIlllIll.lIII[68] = IIlllIll.llIll(IIlllIll.IIlIII(-849145776, -864271521).toCharArray(), 62414L, 915942680);
        IIlllIll.lIII[69] = IIlllIll.llIll(IIlllIll.IIlIII(-849145769, -1689114469).toCharArray(), 25313L, -533792909);
    }

    /*
     * Unable to fully structure code
     */
    private Map<Integer, IIlIlIIIl> lIll(IIIIIIlll var1_1) {
        block5: {
            block6: {
                var2_2 = new HashMap<Integer, IIlIlIIIl>();
                if (var1_1 == null) break block5;
                break block6;
                return var2_2;
lbl6:
                // 1 sources

                while (true) {
                    var3_3 = var1_1.lI.iterator();
                    if (true) ** GOTO lbl19
                    break;
                }
            }
            ** while (var1_1.lI != null)
lbl11:
            // 1 sources

            break block5;
            while (true) {
                var2_2.put(var4_4.l, var4_4);
                if (true) ** GOTO lbl19
                block3: while (true) {
                    var4_4 = var3_3.next();
                    if (var4_4 != null) break;
lbl19:
                    // 4 sources

                    while (true) {
                        if (!var3_3.hasNext()) ** continue;
                        continue block3;
                        break;
                    }
                    break;
                }
                if (!this.llllI(var4_4.l)) ** continue;
            }
        }
        return var2_2;
    }

    private boolean llII(ItemStack itemStack, IIlIlIIIl iIlIlIIIl) {
        if (iIlIlIIIl != null) {
            if (this.IIIIIl(itemStack, iIlIlIIIl.lI)) {
                if (iIlIlIIIl.ll != null) {
                    if (!iIlIlIIIl.ll.isBlank()) {
                        return iIlIlIIIl.ll.equals(this.IIIII(itemStack));
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void ll() {
        if (!this.ll) {
            this.llI = "Idle";
        }
        this.lll();
        this.II.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        if (this.I.lIl() != IIIlllIl.l || minecraftClient.currentScreen != null || minecraftClient.getNetworkHandler() == null) {
            minecraftClient.setScreen((Screen)new InventoryScreen((PlayerEntity)clientPlayerEntity));
            this.Il = true;
            this.IIII = true;
            return;
        }
        minecraftClient.getNetworkHandler().sendPacket((Packet)new ClientCommandC2SPacket((Entity)clientPlayerEntity, ClientCommandC2SPacket.Mode.OPEN_INVENTORY));
        this.lI = true;
        this.IIII = true;
    }

    private String lllI(ItemStack itemStack) {
        return Registries.ITEM.getId((Object)itemStack.getItem()).toString();
    }

    /*
     * Unable to fully structure code
     */
    private String IIIII(ItemStack var1_1) {
        block18: {
            block17: {
                block30: {
                    block25: {
                        block28: {
                            block29: {
                                block21: {
                                    block24: {
                                        block27: {
                                            block23: {
                                                block16: {
                                                    block22: {
                                                        block26: {
                                                            block20: {
                                                                block19: {
                                                                    if (var1_1 != null) break block26;
lbl2:
                                                                    // 2 sources

                                                                    return null;
                                                                    while (true) {
                                                                        v0 = var7_8.toString();
                                                                        break block16;
                                                                        break;
                                                                    }
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_7 = (StatusEffectInstance)var5_6.next();
                                                                        var4_4.add(var6_7);
                                                                        break block17;
                                                                        break;
                                                                    }
lbl12:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var3_3.append(v1);
                                                                        break block18;
                                                                        break;
                                                                    }
lbl16:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var5_5 >= var4_4.size()) break block19;
                                                                        break block20;
                                                                        break;
                                                                    }
lbl19:
                                                                    // 2 sources

                                                                    return v2;
lbl21:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var7_8 != null) ** continue;
                                                                        break block21;
                                                                        break;
                                                                    }
lbl24:
                                                                    // 1 sources

                                                                    return null;
                                                                }
lbl27:
                                                                // 2 sources

                                                                while (var2_2.customColor().isPresent()) {
                                                                    break block22;
                                                                }
                                                                break block27;
                                                            }
                                                            var6_7 = (StatusEffectInstance)var4_4.get(var5_5);
                                                            var7_8 = Registries.STATUS_EFFECT.getId((Object)((StatusEffect)var6_7.getEffectType().value()));
                                                            if (var5_5 <= 0) ** GOTO lbl21
                                                            break block28;
                                                        }
                                                        if (!var1_1.isEmpty()) break block29;
                                                        ** while (true)
lbl38:
                                                        // 1 sources

                                                        while (!var4_4.isEmpty()) {
                                                            break block23;
                                                        }
                                                        ** GOTO lbl27
                                                    }
                                                    var3_3.append('#').append((Integer)var2_2.customColor().get());
                                                    break block27;
                                                }
lbl46:
                                                // 2 sources

                                                while (true) {
                                                    var3_3.append(v0).append(':').append(var6_7.getAmplifier()).append(':').append(var6_7.getDuration());
                                                    ++var5_5;
                                                    ** GOTO lbl16
                                                    break;
                                                }
                                            }
                                            var4_4.sort(Comparator.comparing((Function<StatusEffectInstance, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IIlIl(net.minecraft.entity.effect.StatusEffectInstance ), (Lnet/minecraft/entity/effect/StatusEffectInstance;)Ljava/lang/String;)()));
                                            var3_3.append('|');
                                            var5_5 = 0;
                                            ** while (true)
lbl57:
                                            // 1 sources

                                            while (true) {
                                                v2 = var3_3.toString();
                                                ** GOTO lbl19
                                                break;
                                            }
lbl60:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = Registries.POTION.getId((Object)((Potion)((RegistryEntry)var2_2.potion().get()).value()));
                                                if (var4_4 != null) break block24;
                                                break block25;
                                                break;
                                            }
                                        }
                                        ** while (var3_3.length() != 0)
lbl66:
                                        // 1 sources

                                        v2 = null;
                                        ** while (true)
                                    }
                                    v1 = var4_4.toString();
                                    ** GOTO lbl12
                                }
                                v0 = "?";
                                ** while (true)
                            }
                            var2_2 = (PotionContentsComponent)var1_1.get(DataComponentTypes.POTION_CONTENTS);
                            if (var2_2 == null) {
                                ** continue;
                            }
                            break block30;
                        }
                        var3_3.append(',');
                        ** while (true)
                    }
                    v1 = "?";
                    ** while (true)
                }
                var3_3 = new StringBuilder();
                if (var2_2.potion().isPresent()) {
                    ** continue;
                }
                break block18;
            }
lbl92:
            // 2 sources

            while (true) {
                if (!var5_6.hasNext()) ** GOTO lbl38
                ** continue;
                break;
            }
        }
        var4_4 = new ArrayList();
        var5_6 = var2_2.customEffects().iterator();
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 23463;
        var7_2 = "\u8356\u46e5\u72c8\u44e5\u4cc8\ub6f2\u52d2\u6c05\u659f\u4ed1\ue2f9\uc38a\u0fb7\ue60d\u7bbf\u3f7f\ub839\ud2a9\uad2f\ua183\ua76f\u96bb\ue84b\ubccd\ufa37\ub3f7\ua6d1\ue2db\u7a31\u5fe1\u76f7\u9f42\ua4f0\u32b6\ub01c\u92d7\ua966\ue8d5\u3d0a\ue2a5\u96a2\uf864\u5ac0\u2321\u03b1\uf269\u4244\u11af\u70cc\u5bfe\u13e0\u4766\u2a34\ub6e5\u9e7c\ub3eb\u62da\u8f1a\ub859\u0388\ub7a6\u9093\u9293\ue56f\u00b9\u261d\u235e\u1044\uf2ac\u32da\uc96c\u17af\u7954\u924a\ua364\u2d63\ubf7f\u62a5\u8832\ud4f5\u07c4\u2204\ue4d4\u9e11\u5777\u8b18\u4372\u3755\u1d17\ue4cf\ud820\u470a\ub80a\u89e1\u13cd\ua777\u6e3c\ude37\ua6e0\u7b05\u129b\udfb8\u444e\u9f5f\ub05e\udad5\u0a6d\ub27b\u1544\u3a27\ufedf\ud3f2\u4c2e\u4d75\u80de\udb6a\u88bf\u34e1\ua857\u60ac\u1d1d\u8eac\uba91\uf636\ucbe3\uab76\ud632\u1fea\u8f77\ucf67\ud698\u7121\u68c8\uc3cd\u9e22\ua1a9\uda45\u97d7\u7882\ud44b\u727c\uee2a\u6feb\udfe2\u3a04\u1f34\uad01\ua3a3\u2c8c\uf85c\ufdef\u82c2\u8f21\u5132\u8c95\u1a0a\ua0e0\u3dd4\u10c9\u3e8a\u8c88\ub4db\u8ebb\uc56c\uc122\u5999\uda69\ubbbd\ue63e\u420a\u69d6\u31b7\ua38e\uf733\uec1b\u63c4\uc7af\ub91c\ued58\u35be\u06df\u8def\u4b10\uacc2\ub096\u45c9\uca16\u7a87\u15bc\uec3c\u3d14\u952b\ueb69\uef61\u27cf\ue768\u3b30\uac5b\ua89b\ubabe\u7225\ude07\ucfc9\u8b03\u8dd5\u7ff5\u45a9\u9ed6\u9181\u7a39\u884f\u175c\u53a1\u1c30\uf03d\ufe4a\u564f\ucc6a\u77af\u2736\u1110\u6b77\uc32b\u7391\u80aa\ubaff\u5a50\u5c6f\u5685\u3c1e\u45ba\uc71c\uc9d1\ubf36\u8c27\u036b\uceb2\u68bf\u9d9c\uf95f\ud29a\u5a9c\u4939\ud559\u03e4\u6c87\ub047\u522b\ud68c\ua64a\u4fc8\uf14c\ue80d\uc48a\u950f\u12b0\u7385\u2989\u22e4\ue9bd\u2be6\u9673\ub698\u152d\u6257\u7c95\u7b59\u187d\uf68d\u11bc\u4a05\ude49\uc9ca\udeb5\ud881\u31d7\u08f3\ub4a4\u67b4\u98b4\u7cc7\u50ab\u9cfd\u49dd\u1410\u4413\u5507\u82d2\ud75b\u309c\ubaef\uaa61\uc0fe\u75df\u5cc9\u9fed\u2c00\ubb67\u1d53\uab88\u39a5\u9b4e\uf5f0\u2f7c\u91b1\u1f55\ua235\u216a\ue466\ubd52\u198d\u9bca\uedb4\ub384\u6935\uc758\u18eb\u2882\u4585\u897b\u02dc\u43d0\u6506\udeb7\u6184\ufea4\u6692\ue656\u1c34\uf735\ub4a3\u7b18\ufa33\u27bd\u3544\u5def\uda8f\u7fa0\u0f87\u9b13\u90fc\u8cbe\u7ba9\u0015\u8208\u2895\u5c3b\u5c0c\uab7c\u92d2\ub03d\u8285\u3e5e\ub2a9\u7dbf\uaa26\u879b\u0cef\udefd\uaef7\u126d\u59c8\u78c8\u7d24\u2769\u15ef\ubb44\ufc67\u1baf\u29b9\u7ace\uf5a7\u41a7\u9586\u6cdc\u161f\uec6c\ub236\u62fc\ufd66\u8b11\uff29\u3c8a\u4597\u97b2\uffe6\u7d05\ud83c\u44eb\u9761\uc850\ud3a1\u8c71\u7f0b\ue006\u559e\u1645\u8ced\u696a\uff77\u8088\ud216\u213e\udd50\u49dd\uc5da\ub17b\u6230\ua784\uefc5\uc193\u1660\u38e5\ub113\u11c1\u0262\ua92c\ud3b9\uf40b\ue948\u8595\u83a9\u0e39\ua410\u457e\u645a\u900b\ub9ce\ua1d9\u4d24\udf0f\u5206\ubbe8\ud35c\u520e\ua7ed\u11e3\u43f2\ue2f8\u67de\u22cb\u17bc\ueab4\u628e\ud6e4\u237f\u2d37\u0841\uc600\uc5a4\u15f0\uc500\u5b37\u8724\u0bd82\u2839\u9c52\ufb4e\u7239\u7b04\ufb89\uf1a2\u2041\ub9dd\u91ee\ud676\u87e9\u189a\u01c8\ub484\uea17\ud4b9\u85d7\u600d\uc1af\ub985\ueaf7\uf2af\ubc0e\ue4a4\u35c7\ud75c\uefb5\u32b2\ua3c5\u9023\ub27c\u301a\u1b81\uad21\u5cce\uf2a0\ufd6b\u5a8a\udb00\udd0c\u770d\u0bba\ud3a3\u6e3b\u4866\u054b\u2089\ub61f\u7edb\uf868\u366a\u4135\uf350\ud181\ua8a2\u0ba8\u1bc2\u619d\u5a9a\uf064\ud0f1\u9612\u5d51\u43e8\u901e\u0f33\u18fc\u2606\uc989\u39d2\u3770\u0373\uf39d\u7a57\uc430\u2c15\u580e\u2e89\u22ce\udc5f\u3258\u1a2a\u1f1e\u3b0f\u02dd\u48bf\uce48\ua06c\uac02\u82bb\u5fca\u50cc\u4637\u1899\u4bfe\u54de\u9dcf\ud7da\u6441\u39bd\ue819\u5c23\ufd46\u80b7\uedc9\u0e1a\u0f31\u3319\u9123\u804b\u48fb\u2644\u5425\u8f2e\u480c\u7207\u50f3\u5123\ua731\u36dd\uc903\u1ba3\ua77a\u9a10\u164c\u4ba9\u6d8c\ud742\u8bde\u2d8b\uf3a0\u772e\u4c1a\u1cd0\u4bc6\u495d\ua71f\u942a\u8917\u66b1\ua329\u81dc\u57a4\uae2f\u2cee\ue951\uecfc\u4a70\u7e9c\u63d7\u944b\u4787\u8ff1\u7c0d\u7b4e\ub4c2\u1658\u41ab\u8cba\ub4ab\ua534\u1c55\ufaa3\u8e80\u6006\ud545\uc2f8\uc4b3\u7f85\uf56c\u070b\u07bd\ua033\u6b8c\u059b\u19fb\u5108\uba68\u967e\ue20e\u6221\ub33b\uc74c\u1cb6\ud628\u3a49\ua415\u631d\u95ee\u35a6\uf762\u1e10\uc0e9\ud74b\u3407\ud412\uf0e6\u11f2\u71b1\u5d88\u31e9\u8a43\u0ce1\u6fb3\ubef5\u7e8a\u98ba\ue9d4\u98f7\u3a29\uc189\u4170\u7d3c\u2818\u3014\ue728\u2f4d\ue137\u25e9\u530b\u15de\u3405\u20b8\u835b\u2008\u37e4\ub9e9\u8b39\ud51c\u09fa\u5074\ud8e8\ud97d\u4945\ue699\uf1be\ucd79\u423e\u5e2b\u7ec3\u771b\uec61\u6de8\u4b58\uefee\ueb4b\u465c\u1ef6\u87d6\u72c1\u9067\u31d6\u58d6\uab1d\ubc54\u708a\u7bc4\uabe1\u69de\u953b\u7828\u32eb\u7ce2\u261a\u9906\u8a3f\u16b5\u6c67\ue490\u7525\u8de6\ud77f\uaec9\u9846\ua7b4\u210a\uf075\ue4ba\ub04b\ud223\u23e8\u66a6\uf87b\ucafd\uba57\u2d44\u2eed\u1b1c\uf82d\u8b08\u6f1c\u7d32\u1ca7\u2c7c\ue86b\uc276\ud4b2\uce2c\uc55f\u4320\ud345\ub48c\u8ed1\ud1fe\ucf46\ua26c\u5359\u50e2\u5934\ucefc\ufc83\u7b8b\u2d42\u3c0f\u503b\ub098\u04d5\u42c8\u1cc0\u47bb\ucfcd\u2e31\ue655\ufc71\ucf8a\u5121\u8e7d\uaefa\u91f0\u7b08\ue196\u9492\u5946\u5c86\ud842\u2bc5\ua4c8\ub756\u6e86\uf773\ube4c\u12c4\udb70\u7749\u8e88\ueac9\uaf53\u19ae\u2bbf\ub2c2\u40d3\u94a2\ubf54\ub3a2\u8354\u7839\u1e38\ueafe\uc4fd\u7998\ua7d4\u4ad7\u14b0\u550c\u8e22\ucd00\ue4ea\ueb61\uc088\u7333\u8e81\u3175\uef35\u0c65\u6950\u18a4\uc617\ue67a\u547e\ub369\u3a1c\u9917\u57dd\ud838\ua187\u204e\uac8d\uf6e8\uc100\u92d2\u8321\u8618\ub29c\u9005\u63de\u3ee9\uc433\ua10c\uc0bc\u9afa\u1a3e\u6c21\u90d9\u902d\u0ed8\udc32\u843b\ueae8\ub65f\ud4ab\udb28\ucc48\u7f6c\u9984\u123f\ud09f\u99d6\ud51d\ua6e1\ubeed\ufddd\ua2a3\u8d7c\ua62c\uce26\u63db\u7ee1\u2519\ud08b\u77f0\u34d6\u8b59\u4298\uea28\u119b\u6149\u9472\u9f13\uc695\uf5a5\u4603\u556e\ua3ba\u9d50\u3052\u6591\uc2fa\ub191\ub5b5\u1a41\udfd3\u5fc2\ue333\uee8e\u916d\u7337\u7db3\u5332\u016a\u2660\u48ce\ue385\u8829\uf8bb\u13e7\u5d3c\u33c4\ueae0\u3ec9\u5cdc\u02e0\u2cbe\u79e0\u1d38\ua47d\ucd65\u1d75\u7328\u2c5b\ub6cb\u1598\ueaf0\ud462\u5703\u1b02\u1ca4\u0ff5\ua3e7\u07d3\u16ce\u06de\ue795\ufa79\u8417\u6d64\u57ae\u570a\ue7ae\u8695\u826a\u9f57\u1d6b\u1d61\u4f8c\u140f\u6e11\u274c\u1444\u725a\u9a55\u7323\uc166\ue3d7\ufee3\ue45d\uefd6\u94d6\ua590\u93f3\uc4d1\u0640\u7be3\u280a\u0eb7\u7f08\u2abd\u77b2\ud498\u1d0f\u80a4\u425a\u9f14\u19eb\u75cd\uf601\u3767\u5c13\uc130\u6ce3\uc57b\u5e64\ud4a3\u47d2\ue990\u21b6\uccc1\ucd18\u00e3\u32d4\u380f\uf547\u8484\u5b42\u61cb\u5f40\u9b2d\uf834\u2c3a\ud28a\u654c\u5049\u7277\u75ce\u8e2e\u3b0c\u2913\uaff0\ubef0\u7260\u1803\u9db1\u7863\u6d5d\ub711\ue5fd\u4e68\ua6f8\u4c2e\u51fe\ubdba\u3a76\u0805\ube07\ue66d\u3dfa\ufedd\u49fb\u62bf\ud81c\u8631\u0d5e\ue4b1\ua5a2\u7127\u1901\u1683\u2521\u98fb\ua286\u8071\u4650\u1567\u438c\u0139\u2836\u8826\ue73b\u8fd9\ubdd3\u510f\ue9ee\uec8d\u5e87\u667b\u95a0\ua93a\u15f6\u762e\u6ae1\u9db5\u27de\ub937\u6bf6\uab56\u0bbf\u0c37\u96c1\u7ccc\uf57b\u5d38\u0dcc\u080e\u3923\u8238\ue4f3\u41ce\ud981\u927d\uc43d\u88b4\u1c56\ubeac\u4a94\ue1a6\uea4d\u4fa4\ud59f\u1af1\u6b43\ub1e7\ue170\uc6e9\u7833\uebc1\u6c5e\u21e6\ucd7d\u24b1\u03d7\u1f2a\ue2ad\u37cb\u31bc\ubb38\u647a\udad3\u53bf\u3c92\u3491\uc130\u3879\u5ee9\uacb2\u42dd\u0c81\u11a1\u363c\u593c\ub0b7\u50a2\uf15f\u1ed3\u8725\u6f63\u397b\u69ee\u65f6";
        var8_3 = "\u0014\u0004\b\b ,\f\f\f\u0014\f\u0018\f\u0004\b\b\u0014\u0010\u0004T\f\f\f\b\b\u0014\b\f\b\f\b\u0004\f\f\b\u0004\u0004\b\u0010\u0004\u0018\f\u0014\f 4\f\f\f\b\b\u0010,\u0010\b\b\u0004\u0014\u001c\u0018$\u0014\b\f\f\u0018,\u0018$".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl17
lbl7:
        // 2 sources

        while (true) {
            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl47
            break;
        }
        while (true) {
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            if (++var10_5 < var8_3.length) ** GOTO lbl7
            var13_8 = 0;
lbl17:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 == 0) ** break;
            ** continue;
            IIlllIll.lIll = var9_4;
            IIlllIll.llII = new Object[var9_4.length];
            var2_13 = -601082049;
            var0_11 = "L\u001d\u00e1\u0089_5[\u00f0\u0082}\u00b2\u00f2\u007fO+++\u008e\u008f\u00fd\u009d\u00d6\ft\u00a6d\u00fe\u00f3\u00b4>\u009cH\u00daA\u00ad\u0002\u00a5U\u0011\\q`\u00dd\u00d4V@\u00bfM\u0011M\u0003\u00f5\u00bd\u00d6#\u0018\u00de\u00ddEV<\u00e0l\u00ac\u0085o#qO\u001a\u0014A\u00bb\u001e'\u0081\u008f-\u00bc:g\u0005\u00cb~-\u00b8\u0019\u0002)\u00b0\u00ae\u00b5\u00c1\u00dd\u00ef\u0087\u00fa\u00b6\u008d\u00d8\u0003V \u00e2\u00e2R\u0003YI+\u0096\u00d5\u0090G:y\u00db\u0019Q\u00b1\u0084\u00ac\u0000\u00f5:k\u00e5m\u0082_o\u0014#[\u00c2\u0097\u00e6B\u00f1\u00b8$A#\u00b2\u000b\u00b9:\u00ad\u00b48\u00c2V\u0099\u00d5\\\u00c4R\u0012q\u00b5\u001f\u0013p\u00e2\u0096T\u000bk\u008f\u00fd\n\u00a08\u00aekw\b%P\u0019\u000ej\u008a\u00bbh\u00fe?\u00f9\u0091/\u00a1\u000bC\u00ed\u00bd\u00c2\u0011\u001a\\\u009e\u00f9\u0092\u00f8X\u00d9aw\u00ee8\u00c0\u00fdY<6\u00ben\u00a2>\u009eR\u0099\u00f49\u00dcm\u00b8#f\"\u0010\u00e2zKP\u009a\u000f\u00ba\u00d4\u00der\u00b8'\u008a\u00fd\np5<\u008b%\u0088\u00b9\u00aa\u0082\u00d5*\u00b75\u0090f0\u00f7\u00809a\u0083\u000b\u00ed\u00b5k\u007f\u0090\u0002\u00bd\u00c2\u00f2;]\u00ac[4\u00df\u008c\u009c\u00d37x\u00aa\u009fVWm\u00b36\u00cc\u00a6\u00b6k\u00a5O\u00d3\u00ce\u00cf\u00f0\u0084\u00dc\u0015\u00b4\u0095\u00d8?]\u0095nw\u00ef\u00f3\u008c2.\u0017;tg;\u00a3\u009e\u0016\u0087\u00fdi\u00ae\u0091\u00d2\u008e\u00f1\u008f\u0017\u00ff\u00c1\u001cQ\u008f]L\u0083R<\u00ac\u00bay\u00fae8>\f\u00ce\u00d1k[\u0098\u0095\u00dd\u00a1Juw\u00d8O8\u00b0\u00c03\u00f2\u00d5\u001d\u00a6\u00c7\u0096\u00d7nzF\u00d0Z\u0016\u00ddBpL\u0081D\u00b5VY\u00a4B\u00f5\u00de\u008dY\u00e4\u00a7\u00dc\u00de\u00cc\u0082\u00df\u00ab\u00d0Xj\u00ab+\u00daT\u00df\u00fd-\u00e6,\u0016,^\u00b8h\u00c8\u00f8\u00aa?\u00c7\u00ea\u00d2a\u00c8\u00ac\r\u0012i\u0018.mw}\u0086\u00b9\u00f6\u0014S$\u00dd\u008b\"-Q\u00d0htj\u0014,\u0007\u00f7r|\u00b4~\b\u00ea\u0003\u00feI\u00ab\u00f8Z\u0001-4\u001b\u00c9k_\u00d8y\u0018\u009c\u0013J\u00a5uR\u00bb\u0017\u0090\r\u00f9,\u00faN\u00fe\u00997\u00a8\u00d2\u00ee\u00be}\u008a\u001c\u0007(\u0016\f|n\u00e3\u0000iL_\u0000\u008bn\u008e\u00ae\u0081\u008a\u00e0\u0087\u0013\u001a\u009bXp\u00ddS\u00fc\u00e2\u00bb\u0086prf2QYv\u00dcQ|\u00efw\u00aa\u00c1\u0090jH\u00b6\u00c6\u00d9\u0096I\u0004\u0000y(\u00b6\u00f8g\u00f8\u00c8>\u008fW\u0003\u001a\u00e7u\u00f3^\u00d2\u00ae\u00af\\\u0014\u0080rh\u00f3\u008e\u00a2\u0005:\u009a\u00f7\u00c0s\u00e3\u00fa)\u0004\u008ea\u00dcvB\u0003,e\u0082\u00f2\u00d5\u00cd\u00f0\u0087\u00e1\u0092\u00d9\u00c7C\u00e6dMq\\\u00cc\u0005B\u00ef\u008d{\u00e1\u009c\u00a9\u00e2>\u00ab\u00ffC\u008a:\u001c)\u00a7\u0016\u00b7\u00c0~)\u0096G\u00d9}\u001e\u0085\u00f2\u00e4Mj\u000e\u00d7\u00f1\u0083jb\\\u00c4\u00d6*W\u00af\u00d6\u0080b\b\u00a5r\u00f4]j/\u0097\u00acn2\u0097e\u008e\u00d5b\u0082\u00ac,\nLM\u0083\u00ae\u00f3\u0084\u00fd\u0099\u0017\u00a2\u0083\u000b-\u008c\u0014\u0001\u0091\u00a1;qN\u0007\u00ca*\u00d3\u00e4\u00b1[&\bj\u00e3Y\u009bH\u00ea\u00ba\u001e\u00e6C\u008b@\u0085q(\u0018}\u0087y4\u00efm\u000b\u0012O;\u008f\u00eb\u00aa\u009ct\u000f\u00e4\u00fb\u0017\u0082\u00cc-\u00ccq\u00a2\u00d4 v\u00db\u00aa\u00d6\u0017e\u001d\u008f\u00a0\u000bCh\u00dbI\u000b0\u008a\u00a5\u0087\u008b\u001c$\u00d5\u00e1k\u00b1\u00f7\u00dfV\u0004\u0084}\u000b\u008d\u00df\u00ee\u00ea\u00c6k\u00cc\u0087\u00b8\u00f4A\u00e4\u00b7C\u009f'\u009e!\u00cc\u00f2\u00fb+\u0097J\u0086\u00cc\u00f9WU#r\u00e6\u0085'\u00a9\u00ab\u00af\u00a7a\u00ca\u00d8\u00cd\u00dcx\u00a0\u00ca\u0099\u00afT\u00cc`\u0016\u00e6\u00ce#\u0002S\u0094\u00e0]f|\u00fb\u009e\u00c7\u0092\r\u0086\u00a9q\u00fc\u00ed\u00b7MZ\u001c\u00b5\u00eam9$^\u00978Q\u0094]\u00db/\u0007\u00a3\u00ed\u00ddm)\u00e1\u00dc\u0001\u00eb|\u00cd\u008a_\u001b\u0010`\u00af\u00aa`\u00c0\u00d8`\u00cf\u00a9\u0085\f\u00b3Y\u00d1\u000f\u00c9b\u0094g\u00f3>\u0094\u00be\u0098\u0095b\u0087\u00f9\u00ca\r\u00adyW\u00ef\u001eW\u00eaQ\u00ed\u0089\u00b24\u001e\u0088\fC5~_\u008ed\u00dfc\u00d5\u00af\u00aa1\u0015/5\u00b4\u00be\u00ba".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IIlllIll.lIlI = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIlllIll.lIlI[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            IIlllIll.lIII = new String[70];
            IIlllIll.lIlI();
            IIlllIll.Illl = "Inventory Presets";
            IIlllIll.IlIl = new GsonBuilder().setPrettyPrinting().create();
            IIlllIll.lIIl = "3";
            IIlllIll.IIlI = IIlllIll.lIIll();
            return;
        }
        block10: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl47:
            // 2 sources

            switch (var15_10 % 6) {
                case 4: {
                    v0 = 14;
                    continue block10;
                }
                case 2: {
                    v0 = 38;
                    continue block10;
                }
                default: {
                    v0 = 32;
                    continue block10;
                }
                case 1: {
                    v0 = 67;
                    continue block10;
                }
                case 5: {
                    v0 = 112;
                    continue block10;
                }
                case 3: 
            }
            v0 = 54;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Path IIIll(String string) {
        Path path = this.IIllI();
        if (path == null) return null;
        String string2 = ".json";
        String string3 = string;
        Path path2 = path.resolve(string3 + string2);
        return path2;
    }

    public Map<String, Object> IIlII() {
        return this.lIl();
    }

    private static /* synthetic */ String IIlIl(StatusEffectInstance statusEffectInstance) {
        Identifier identifier = Registries.STATUS_EFFECT.getId((Object)((StatusEffect)statusEffectInstance.getEffectType().value()));
        return identifier != null ? identifier.toString() : "";
    }

    private Path IIllI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            if (clientEntrypoint.IIl() != null) {
                return clientEntrypoint.IIl().llIIl();
            }
        }
        return null;
    }

    private void IIlll(MinecraftClient minecraftClient) {
        String string = this.lllIl(this.Ill);
        String string2 = "Loaded ";
        this.llI = string2 + string;
        this.ll = false;
        this.Ill = null;
        this.lIl = "";
        this.IIII = false;
        if (((Boolean)this.IIl.lIl()).booleanValue()) {
            this.IlII(minecraftClient);
        } else {
            this.Il = false;
            this.lI = false;
        }
    }

    private long IlIII() {
        double d;
        double d2 = this.IIIl.IIIl();
        if (d2 == (d = this.IIIl.IIII())) {
            return Math.round(d2);
        }
        return Math.round(ThreadLocalRandom.current().nextDouble(d2, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> IlIIl(IIIIIIlll iIIIIIlll) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put(StringFactory.IIl(lIII[32]), iIIIIIlll.II);
        linkedHashMap.put("name", this.lllIl(iIIIIIlll));
        linkedHashMap.put("createdAt", iIIIIIlll.I);
        linkedHashMap.put("itemCount", iIIIIIlll.lI == null ? 0 : iIIIIIlll.lI.size());
        linkedHashMap.put("bind", iIIIIIlll.ll == null ? "" : iIIIIIlll.ll);
        linkedHashMap.put("bindLabel", this.IIl(iIIIIIlll));
        linkedHashMap.put("bindKey", this.IlI(iIIIIIlll));
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        if (iIIIIIlll.lI != null) {
            for (IIlIlIIIl iIlIlIIIl : iIIIIIlll.lI) {
                if (iIlIlIIIl == null || !this.llllI(iIlIlIIIl.l)) continue;
                arrayList.add(this.llIII(iIlIlIIIl));
            }
        }
        linkedHashMap.put("slots", arrayList);
        return linkedHashMap;
    }

    public Map<String, Object> IlIlI(String string) {
        String string2 = this.lIlIl(string);
        if (string2.isBlank()) {
            throw new IllegalArgumentException("Missing preset id");
        }
        Path path = this.IIIll(string2);
        if (path == null || !Files.exists(path, new LinkOption[0])) {
            throw new IllegalArgumentException("Unknown preset");
        }
        try {
            Files.deleteIfExists(path);
        }
        catch (IOException iOException) {
            String string3 = iOException.getMessage();
            String string4 = "Could not delete preset: ";
            throw new IllegalStateException(string4 + string3, iOException);
        }
        if (string2.equals(this.lIl)) {
            this.IllIl(MinecraftClient.getInstance(), "Preset deleted");
        }
        this.II.remove(string2);
        this.lll();
        return this.lIl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String IlIll(String string) {
        if (string == null) return "";
        String string2 = string.replaceAll("[^a-zA-Z0-9 _\\-]", "").trim();
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        if (!this.ll) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIIlI(minecraftClient)) {
            this.IllIl(minecraftClient, "Waiting for player");
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            this.IllIl(minecraftClient, "Cursor stack is not empty");
            return;
        }
        if (!this.l(minecraftClient)) {
            if (this.IIII) {
                this.IllIl(minecraftClient, "Inventory closed");
                return;
            }
            if (orchard.internal.IIlI.II(minecraftClient)) {
                this.llIl(minecraftClient, clientPlayerEntity);
                orchard.internal.IIlI.I(minecraftClient);
                return;
            }
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.IlII < this.III) {
            return;
        }
        IIIlIIlI iIIlIIlI = this.lIlII(clientPlayerEntity, this.Ill);
        if (iIIlIIlI == null) {
            this.IIlll(minecraftClient);
            return;
        }
        if (!orchard.internal.IIlI.II(minecraftClient)) {
            return;
        }
        this.IIIlIl(minecraftClient, clientPlayerEntity, iIIlIIlI.I, iIIlIIlI.l);
        if (clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            this.IlII = l2;
            this.III = this.IlIII();
            String string = this.lllIl(this.Ill);
            String string2 = "Loading ";
            this.llI = string2 + string;
            return;
        }
        this.IllIl(minecraftClient, "Cursor stack could not be cleared");
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIIIIlll IllII(String string) {
        if (string == null) return null;
        if (string.isBlank()) {
            return null;
        }
        Path path = this.IIIll(string);
        if (path == null) return null;
        if (Files.exists(path, new LinkOption[0])) return this.IlllI(path);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIl(MinecraftClient minecraftClient, String string) {
        if (this.ll && ((Boolean)this.IIl.lIl()).booleanValue()) {
            this.IlII(minecraftClient);
        } else {
            this.Il = false;
            this.lI = false;
        }
        this.ll = false;
        this.Ill = null;
        this.lIl = "";
        this.IIII = false;
        this.llI = string != null && !string.isBlank() ? string : "Idle";
    }

    @Override
    public void llll() {
        this.IllIl(MinecraftClient.getInstance(), "Stopped");
        this.II.clear();
    }

    private IIIIIIlll IlllI(Path path) {
        try {
            IIIIIIlll iIIIIIlll = (IIIIIIlll)IlIl.fromJson(Files.readString(path), IIIIIIlll.class);
            if (iIIIIIlll == null || iIIIIIlll.II == null) {
                return null;
            }
            if (iIIIIIlll.lI == null) {
                iIIIIIlll.lI = new ArrayList<IIlIlIIIl>();
            }
            return iIIIIIlll;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int Illll(ClientPlayerEntity var1_1, Map<Integer, IIlIlIIIl> var2_2, IIlIlIIIl var3_3) {
        block5: {
            block6: {
                var4_4 = -1;
                var5_5 = -2147483648;
                var6_6 = IIlllIll.IIlI;
                var7_7 = var6_6.length;
                var8_8 = 0;
                if (true) ** GOTO lbl16
                while (true) {
                    var11_11 = 1000 - Math.abs(var10_10.getCount() - var3_3.III);
                    if (!var2_2.containsKey(var9_9)) {
                        var11_11 += 100;
                    }
                    break block5;
                    break;
                }
                block1: while (true) {
                    if (!this.lllll(var10_10, var9_9, var2_2)) ** continue;
lbl14:
                    // 3 sources

                    while (true) {
                        ++var8_8;
lbl16:
                        // 2 sources

                        if (var8_8 >= var7_7) break block6;
                        var9_9 = var6_6[var8_8];
                        if (var9_9 == var3_3.l || !this.llII(var10_10 = this.llIlI(var1_1, var9_9), var3_3)) continue;
                        continue block1;
                        break;
                    }
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var5_5 = var11_11;
                    var4_4 = var9_9;
                    ** GOTO lbl14
                    break;
                }
            }
            return var4_4;
        }
        if (var11_11 > var5_5) ** break;
        ** while (true)
        ** while (true)
    }

    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl() || minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        if (minecraftClient.currentScreen != null && !(minecraftClient.currentScreen instanceof InventoryScreen)) {
            return;
        }
        for (IIIIIIlll iIIIIIlll : this.lIllI()) {
            InputUtil.Key key;
            if (iIIIIIlll == null || iIIIIIlll.II == null || iIIIIIlll.ll == null || iIIIIIlll.ll.isBlank()) continue;
            try {
                key = InputUtil.fromTranslationKey((String)iIIIIIlll.ll);
            }
            catch (Exception exception) {
                continue;
            }
            if (key == null || key.equals((Object)InputUtil.UNKNOWN_KEY)) continue;
            boolean bl = lIIllllI.llI(minecraftClient, key);
            boolean bl2 = this.II.getOrDefault(iIIIIIlll.II, false);
            this.II.put(iIIIIIlll.II, bl);
            if (!bl || bl2) continue;
            try {
                this.lIIIl(iIIIIIlll.II);
            }
            catch (Exception exception) {}
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Map<String, Object> lIIIl(String string) {
        IIIIIIlll iIIIIIlll = this.IllII(this.lIlIl(string));
        if (iIIIIIlll == null) {
            throw new IllegalArgumentException("Unknown preset");
        }
        if (!this.IIIlIIl()) {
            String string2 = " before loading a preset";
            String string3 = Illl;
            String string4 = "Enable ";
            throw new IllegalStateException(string4 + string3 + string2);
        }
        this.Ill = iIIIIIlll;
        this.lIl = iIIIIIlll.II == null ? "" : iIIIIIlll.II;
        this.ll = true;
        this.Il = false;
        this.lI = false;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIII = minecraftClient != null && minecraftClient.currentScreen instanceof InventoryScreen;
        this.IlII = 0L;
        this.III = 0L;
        String string5 = this.lllIl(iIIIIIlll);
        String string6 = "Loading ";
        this.llI = string6 + string5;
        return this.lIl();
    }

    private static int[] lIIll() {
        int n = 37;
        int[] nArray = new int[n];
        int n2 = 0;
        int n3 = 9;
        while (n3 < 36) {
            nArray[n2++] = n3++;
        }
        for (n3 = 0; n3 < 9; ++n3) {
            nArray[n2++] = 36 + n3;
        }
        nArray[n2] = 45;
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    private IIIlIIlI lIlII(ClientPlayerEntity var1_1, IIIIIIlll var2_2) {
        block5: {
            block7: {
                block10: {
                    block6: {
                        block9: {
                            block8: {
                                if (var2_2 == null || var2_2.lI == null) break block7;
                                break block8;
lbl3:
                                // 1 sources

                                return null;
lbl5:
                                // 1 sources

                                while (var5_5.lI == null) {
                                    break block5;
                                }
                                break block9;
lbl8:
                                // 1 sources

                                while (this.llllI(var5_5.l)) {
                                    ** GOTO lbl5
                                }
                                break block5;
                            }
                            if (!var2_2.lI.isEmpty()) break block10;
                            break block7;
lbl14:
                            // 1 sources

                            while ((var7_7 = this.Illll(var1_1, var3_3, var5_5)) >= 0) {
                                break block6;
                            }
                            break block5;
                        }
                        var6_6 = this.llIlI(var1_1, var5_5.l);
                        if (!this.llII(var6_6, var5_5)) ** GOTO lbl14
                        break block5;
                    }
                    return new IIIlIIlI(var7_7, var5_5.l);
                }
                var3_3 = this.lIll(var2_2);
                var4_4 = var2_2.lI.iterator();
                break block5;
            }
            return null;
lbl29:
            // 1 sources

            ** while ((var5_5 = var4_4.next()) == null)
lbl30:
            // 1 sources

            ** GOTO lbl8
        }
        ** while (!var4_4.hasNext())
lbl33:
        // 1 sources

        ** GOTO lbl29
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String lIlIl(String string) {
        if (string == null) return "";
        String string2 = string.replaceAll("[^a-zA-Z0-9_\\-]", "");
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<IIIIIIlll> lIllI() {
        if (this.lII == null || System.currentTimeMillis() - this.l > 3000L) {
            this.lll();
        }
        return this.lII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> llIII(IIlIlIIIl iIlIlIIIl) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("area", iIlIlIIIl.II);
        linkedHashMap.put("index", iIlIlIIIl.Il);
        linkedHashMap.put("handlerSlot", iIlIlIIIl.l);
        linkedHashMap.put("itemId", iIlIlIIIl.lI);
        if (iIlIlIIIl.ll != null && !iIlIlIIIl.ll.isBlank()) {
            linkedHashMap.put("potionId", iIlIlIIIl.ll);
        }
        linkedHashMap.put("displayName", iIlIlIIIl.I != null && !iIlIlIIIl.I.isBlank() ? iIlIlIIIl.I : iIlIlIIIl.lI);
        linkedHashMap.put("count", iIlIlIIIl.III);
        String string = lIIl;
        String string2 = "&v=";
        String string3 = URLEncoder.encode(iIlIlIIIl.lI, StandardCharsets.UTF_8);
        String string4 = "/api/inventory-presets/icon?item=";
        linkedHashMap.put("iconUrl", string4 + string3 + string2 + string);
        return linkedHashMap;
    }

    /*
     * Unable to fully structure code
     */
    private int llIIl(ClientPlayerEntity var1_1, IIIIIIlll var2_2) {
        block9: {
            block10: {
                block7: {
                    block8: {
                        block6: {
                            if (var1_1 != null && var2_2 != null) break block9;
lbl2:
                            // 2 sources

                            return 0;
lbl4:
                            // 1 sources

                            while (true) {
                                if (!this.llllI(var6_6.l)) ** GOTO lbl14
                                break block6;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                ++var3_3;
                                ** GOTO lbl14
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var3_3 = 0;
                                var4_4 = this.lIll(var2_2);
                                var5_5 = var2_2.lI.iterator();
lbl14:
                                // 7 sources

                                while (true) {
                                    if (!var5_5.hasNext()) break block7;
                                    break block8;
                                    break;
                                }
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                if (this.Illll(var1_1, var4_4, var6_6) < 0) ** GOTO lbl14
                                ** continue;
                                break;
                            }
                        }
                        if (var6_6.lI != null) break block10;
                        ** GOTO lbl14
                    }
                    var6_6 = var5_5.next();
                    if (var6_6 == null) ** GOTO lbl14
                    ** while (true)
                }
                return var3_3;
            }
            ** while (!this.llII((ItemStack)this.llIlI((ClientPlayerEntity)var1_1, (int)var6_6.l), (IIlIlIIIl)var6_6))
lbl31:
            // 1 sources

            ** while (true)
        }
        ** while (var2_2.lI != null)
lbl34:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private ItemStack llIlI(ClientPlayerEntity clientPlayerEntity, int n) {
        if (clientPlayerEntity == null) return ItemStack.EMPTY;
        if (n < 0) return ItemStack.EMPTY;
        if (n < clientPlayerEntity.playerScreenHandler.slots.size()) return ((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack();
        return ItemStack.EMPTY;
    }

    private static String llIll(char[] cArray, long l2, int n) {
        int n2 = 0xA108CB6F ^ n;
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public List<llIlIlIl> lllII() {
        ArrayList<llIlIlIl> arrayList = new ArrayList<llIlIlIl>();
        Iterator<IIIIIIlll> iterator = this.lIllI().iterator();
        boolean bl = true;
        while (true) {
            IIIIIIlll iIIIIIlll;
            int n;
            String string;
            String string2;
            String string3;
            if (!bl || (bl = false) || !true) {
                llIlIlIl llIlIlIl2;
                llIlIlIl2(string3, string2, string, n);
                arrayList.add(llIlIlIl2);
            }
            do {
                if (iterator.hasNext()) continue;
                return arrayList;
            } while ((iIIIIIlll = iterator.next()) == null || iIIIIIlll.II == null);
            string3 = iIIIIIlll.II;
            string2 = this.lllIl(iIIIIIlll);
            string = this.IIl(iIIIIIlll);
            if (iIIIIIlll.lI == null) {
                n = 0;
                continue;
            }
            n = iIIIIIlll.lI.size();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String lllIl(IIIIIIlll iIIIIIlll) {
        if (iIIIIIlll == null) return "Preset";
        if (iIIIIIlll.Il == null) return "Preset";
        if (iIIIIIlll.Il.isBlank()) {
            return "Preset";
        }
        String string = iIIIIIlll.Il;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llllI(int n) {
        if (n >= 9) {
            if (n < 36) return true;
        }
        if (n >= 36) {
            if (n < 45) return true;
        }
        if (n == 45) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lllll(ItemStack itemStack, int n, Map<Integer, IIlIlIIIl> map) {
        IIlIlIIIl iIlIlIIIl = map.get(n);
        if (iIlIlIIIl == null) return false;
        if (!this.llII(itemStack, iIlIlIIIl)) return false;
        return true;
    }

    private void IIIIII(IIIIIIlll iIIIIIlll) {
        Path path = this.IIllI();
        if (path == null) {
            throw new IllegalStateException("Preset directory is unavailable");
        }
        try {
            Files.createDirectories(path, new FileAttribute[0]);
            String string = ".json";
            String string2 = iIIIIIlll.II;
            Files.writeString(path.resolve(string2 + string), (CharSequence)IlIl.toJson((Object)iIIIIIlll), new OpenOption[0]);
        }
        catch (IOException iOException) {
            String string = iOException.getMessage();
            String string3 = "Could not save preset: ";
            throw new IllegalStateException(string3 + string, iOException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIIIl(ItemStack itemStack, String string) {
        if (itemStack.isEmpty()) return false;
        if (string == null) return false;
        if (!string.equals(this.lllI(itemStack))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.player.playerScreenHandler == null) return false;
        return true;
    }

    private InputUtil.Key IIIlII(IIIIIIlll iIIIIIlll) {
        if (iIIIIIlll == null || iIIIIIlll.ll == null || iIIIIIlll.ll.isBlank()) {
            return InputUtil.UNKNOWN_KEY;
        }
        try {
            return InputUtil.fromTranslationKey((String)iIIIIIlll.ll);
        }
        catch (Exception exception) {
            return InputUtil.UNKNOWN_KEY;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIl(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, int n, int n2) {
        int n3 = clientPlayerEntity.playerScreenHandler.syncId;
        if (n == 45) {
            minecraftClient.interactionManager.clickSlot(n3, n2, 40, SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
            return;
        }
        if (n2 == 45) {
            minecraftClient.interactionManager.clickSlot(n3, n, 40, SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
            return;
        }
        minecraftClient.interactionManager.clickSlot(n3, n, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        minecraftClient.interactionManager.clickSlot(n3, n2, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            minecraftClient.interactionManager.clickSlot(n3, n, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        }
    }

    public Map<String, Object> IIIllI(String string, String string2) {
        String string3 = this.lIlIl(string);
        if (string3.isBlank()) {
            throw new IllegalArgumentException("Missing preset id");
        }
        IIIIIIlll iIIIIIlll = this.IllII(string3);
        if (iIIIIIlll == null) {
            throw new IllegalArgumentException("Unknown preset");
        }
        if (string2 == null || string2.isBlank() || "key.keyboard.unknown".equals(string2)) {
            iIIIIIlll.ll = null;
        } else {
            try {
                InputUtil.fromTranslationKey((String)string2);
            }
            catch (Exception exception) {
                String string4 = string2;
                String string5 = "Invalid key: ";
                throw new IllegalArgumentException(string5 + string4);
            }
            iIIIIIlll.ll = string2;
        }
        this.IIIIII(iIIIIIlll);
        this.lll();
        this.II.remove(string3);
        return this.lIl();
    }

    private static int IIIlll(int n, int n2) {
        return lIlI[n ^ 0x8C1854F7] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xCD631013;
        char[] cArray = lIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlllIll.llII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xEDDAEAB7;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 31 -> 72;
                case 22 -> 188;
                case 15 -> 77;
                case 27 -> 133;
                case 13 -> 244;
                case 14 -> 10;
                default -> 89;
                case 21 -> 113;
                case 17 -> 177;
                case 12 -> 253;
                case 16 -> 166;
                case 2 -> 234;
                case 5 -> 40;
                case 23 -> 220;
                case 9 -> 61;
                case 4 -> 54;
                case 3 -> 8;
                case 29 -> 195;
                case 10 -> 89;
                case 6 -> 76;
                case 8 -> 143;
                case 18 -> 236;
                case 19 -> 95;
                case 30 -> 149;
                case 11 -> 79;
                case 26 -> 143;
                case 7 -> 173;
                case 24 -> 246;
                case 28 -> 223;
                case 20 -> 80;
                case 1 -> 149;
                case 25 -> 50;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

