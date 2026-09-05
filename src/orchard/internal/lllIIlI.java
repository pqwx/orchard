/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Unknown command. Type .help for a list of commands.
 *   - Failed to export config: 
 *   - Failed to delete config: 
 *   - Failed to load config: 
 *   - Failed to save config: 
 *   - Config exported: 
 *   - Unknown module: 
 *   - Config deleted: 
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
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 */
package orchard.internal;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import orchard.config.CloudConfigManager;
import orchard.config.LegacyConfigMigration;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIll;
import orchard.internal.IIIIlII;
import orchard.internal.IIIIll;
import orchard.internal.IIIl;
import orchard.internal.IIIlI;
import orchard.internal.IIlllIIIl;
import orchard.internal.IIlllIll;
import orchard.internal.IIllllll;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIIIII;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIlIII;
import orchard.internal.IlIlllI;
import orchard.internal.Illl;
import orchard.internal.IlllIllI;
import orchard.internal.lIIIlII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlII;
import orchard.internal.lIllIIlI;
import orchard.internal.lll;
import orchard.internal.lllIlIII;
import orchard.module.combat.AimAssist;
import orchard.module.combat.AimOptimizer;
import orchard.module.combat.AirAnchor;
import orchard.module.combat.AntiBot;
import orchard.module.combat.AutoCart;
import orchard.module.combat.AutoCrystal;
import orchard.module.combat.AutoDhand;
import orchard.module.combat.AutoHeadWeb;
import orchard.module.combat.AutoHitCrystal;
import orchard.module.combat.AutoInventoryTotem;
import orchard.module.combat.AutoMace;
import orchard.module.combat.AutoSafeAnchor;
import orchard.module.combat.AutoTotem;
import orchard.module.combat.Autoclicker;
import orchard.module.combat.Backtrack;
import orchard.module.combat.BowSpam;
import orchard.module.combat.BreachSwap;
import orchard.module.combat.CartProtection;
import orchard.module.combat.ClickCrystal;
import orchard.module.combat.FastAnchor;
import orchard.module.combat.FastCart;
import orchard.module.combat.HitWeb;
import orchard.module.combat.KeyXbow;
import orchard.module.combat.KillAura;
import orchard.module.combat.KnockbackDisplacement;
import orchard.module.combat.MaceSwap;
import orchard.module.combat.NoMissDelay;
import orchard.module.combat.PlayerFreeze;
import orchard.module.combat.PotAssist;
import orchard.module.combat.ShieldBreaker;
import orchard.module.combat.SpearLunge;
import orchard.module.combat.rIZdmx5SQj6YHA;
import orchard.module.hud.BPS;
import orchard.module.hud.Effects;
import orchard.module.hud.FPS;
import orchard.module.hud.Inventory;
import orchard.module.hud.KeybindsHUD;
import orchard.module.hud.ModuleList;
import orchard.module.hud.Notifications;
import orchard.module.hud.Promo;
import orchard.module.hud.Radar;
import orchard.module.hud.Spotify;
import orchard.module.hud.TargetHUD;
import orchard.module.hud.Watermark;
import orchard.module.iface.AimHelper;
import orchard.module.iface.ClickSimulations;
import orchard.module.iface.FakeLag;
import orchard.module.iface.Friends;
import orchard.module.iface.Interface;
import orchard.module.iface.Panic;
import orchard.module.iface.UnloadOrchard;
import orchard.module.iface.VisualSwitch;
import orchard.module.movement.AutoPlay;
import orchard.module.movement.AutoWalk;
import orchard.module.movement.CollisionSpeed;
import orchard.module.movement.JumpReset;
import orchard.module.movement.KeepSprint;
import orchard.module.movement.MoveFix;
import orchard.module.movement.NoJumpDelay;
import orchard.module.movement.NoPush;
import orchard.module.movement.Parkour;
import orchard.module.movement.PearlChase;
import orchard.module.movement.PerfectWindcharge;
import orchard.module.movement.SnapTap;
import orchard.module.movement.Speed;
import orchard.module.movement.Sprint;
import orchard.module.movement.SprintReset2;
import orchard.module.movement.VClip;
import orchard.module.player.AutoArmor;
import orchard.module.player.AutoDeposit;
import orchard.module.player.AutoDrain;
import orchard.module.player.AutoGG;
import orchard.module.player.AutoReconnect;
import orchard.module.player.AutoTool;
import orchard.module.player.ChestStealer;
import orchard.module.player.ElytraSwap;
import orchard.module.player.Extinguish;
import orchard.module.player.FakePlayer;
import orchard.module.player.FastPlace;
import orchard.module.player.FastXP;
import orchard.module.player.HoverTotem;
import orchard.module.player.InventoryCleaner;
import orchard.module.player.LegitScaffold;
import orchard.module.player.NoInteract;
import orchard.module.player.Opsec;
import orchard.module.player.PingSpoof;
import orchard.module.player.StrayUtils;
import orchard.module.player.Teams;
import orchard.module.player.WebAssist;
import orchard.module.player.XCarry;
import orchard.module.render.Animations;
import orchard.module.render.Chinahat;
import orchard.module.render.Cosmetics;
import orchard.module.render.DivebombESP;
import orchard.module.render.FakeClient;
import orchard.module.render.FakeHacker;
import orchard.module.render.Freecam;
import orchard.module.render.FullBright;
import orchard.module.render.Glow;
import orchard.module.render.HitMarker;
import orchard.module.render.ItemESP;
import orchard.module.render.JumpCircle;
import orchard.module.render.M2DESP;
import orchard.module.render.Nametags;
import orchard.module.render.NickSwitcher;
import orchard.module.render.NoBounce;
import orchard.module.render.NoEffectView;
import orchard.module.render.PlayerHider;
import orchard.module.render.PlayerLocator;
import orchard.module.render.PopVisuals;
import orchard.module.render.RangeFinder;
import orchard.module.render.Rotations;
import orchard.module.render.StashFinder;
import orchard.module.render.StorageESP;
import orchard.module.render.StreamerMode;
import orchard.module.render.TargetCircle;
import orchard.module.render.Trajectories;
import orchard.module.render.Xray;

@Environment(value=EnvType.CLIENT)
public final class lllIIlI {
    private final IIIIll I;
    private final HoverTotem l;
    private final PlayerHider II;
    private final AutoDeposit Il;
    private final AimAssist lI;
    private final AutoHitCrystal ll;
    private final Map<Class<?>, ModuleBase> III;
    private final AimOptimizer IIl;
    private final HitMarker IlI;
    private final Backtrack Ill;
    private final Chinahat lII;
    private final KillAura lIl;
    private final FullBright llI;
    private final Xray lll;
    private final KeyXbow IIII;
    private final MaceSwap IIIl;
    private final VClip IIlI;
    private final BPS IIll;
    private final ShieldBreaker IlII;
    private final FakePlayer IlIl;
    private final SnapTap IllI;
    private final JumpCircle Illl;
    private final ElytraSwap lIII;
    private final Glow lIIl;
    private final PearlChase lIlI;
    private final TargetCircle lIll;
    private final KnockbackDisplacement llII;
    private final ClickSimulations llIl;
    private final StorageESP lllI;
    private final AutoTotem llll;
    private final IIIl IIIII;
    private final XCarry IIIIl;
    private final StreamerMode IIIlI;
    private final PingSpoof IIIll;
    private final NoEffectView IIlII;
    private final StrayUtils IIlIl;
    private final Watermark IIllI;
    private final KeybindsHUD IIlll;
    private final Teams IlIII;
    private final IlIlIlIII IlIIl;
    private final Cosmetics IlIlI;
    private final NoMissDelay IlIll;
    private final lll IllII;
    private final AutoDrain IllIl;
    private final Extinguish IlllI;
    private final AutoWalk Illll;
    private final AntiBot lIIII;
    private final ClickCrystal lIIIl;
    private final Promo lIIlI;
    private final Effects lIIll;
    private final RangeFinder lIlII;
    private final BowSpam lIlIl;
    private final FPS lIllI;
    private final List<lllIlIII> lIlll;
    private final Animations llIII;
    private final PerfectWindcharge llIIl;
    private final FastPlace llIlI;
    private final UnloadOrchard llIll;
    private final AutoTool lllII;
    private final M2DESP lllIl;
    private final VisualSwitch llllI;
    private final lIlIIlII lllll;
    private final Map<ModuleBase, Boolean> IIIIII;
    private final rIZdmx5SQj6YHA IIIIIl;
    private final Opsec IIIIlI;
    private final AirAnchor IIIIll;
    private final KeepSprint IIIlII;
    private final SpearLunge IIIlIl;
    private final ItemESP IIIllI;
    private final Sprint IIIlll;
    private final MoveFix IIlIII;
    private final List<ModuleBase> IIlIIl;
    private final HitWeb IIlIlI;
    private final Inventory IIlIll;
    private final PopVisuals IIllII;
    private final DivebombESP IIllIl;
    private final TargetHUD IIlllI;
    private final FakeClient IIllll;
    private final ChestStealer IlIIII;
    private final FastXP IlIIIl;
    private final Map<ModuleBase, Integer> IlIIlI;
    private final IIIIlII IlIIll;
    private final PotAssist IlIlII;
    private final NoBounce IlIlIl;
    private final SprintReset2 IlIllI;
    private final AutoCrystal IlIlll;
    private final Trajectories IllIII;
    private final Nametags IllIIl;
    private final FastCart IllIlI;
    private final AutoArmor IllIll;
    private final NoInteract IlllII;
    private final Spotify IlllIl;
    private final AutoSafeAnchor IllllI;
    private final AutoDhand Illlll;
    private final AutoGG lIIIII;
    private final Interface lIIIIl;
    private final IIIIIIll lIIIlI;
    private final NickSwitcher lIIIll;
    private final Panic lIIlII;
    private final Speed lIIlIl;
    private final CartProtection lIIllI;
    private final List<ModuleBase> lIIlll = new ArrayList<ModuleBase>();
    private final NoPush lIlIII;
    private final Rotations lIlIIl;
    private final List<lllIlIII> lIlIlI;
    private final JumpReset lIlIll;
    private final LegitScaffold lIllII;
    private final InventoryCleaner lIllIl;
    private final Notifications lIlllI;
    private final List<ModuleBase> lIllll = new ArrayList<ModuleBase>();
    private final NoJumpDelay llIIII;
    private final lIlIIlII llIIIl;
    private final List<ModuleBase> llIIlI;
    private final PlayerLocator llIIll;
    private final AutoReconnect llIlII;
    private final AutoInventoryTotem llIlIl;
    private final AutoHeadWeb llIllI;
    private final StashFinder llIlll;
    private final ModuleList lllIII;
    private final AutoMace lllIIl;
    private final CollisionSpeed lllIlI;
    private final List<ModuleBase> lllIll;
    private final IIlllIll llllII;
    private final BreachSwap llllIl;
    private final FakeHacker lllllI;
    private final FastAnchor llllll;
    private int IIIIIII;
    private final PlayerFreeze IIIIIIl;
    private final AutoCart IIIIIlI;
    private final Freecam IIIIIll;
    private final Friends IIIIlII;
    private final WebAssist IIIIlIl;
    private final Parkour IIIIllI;
    private final Autoclicker IIIIlll;
    private final AutoPlay IIIlIII;
    private final Radar IIIlIIl;
    private static final int[] IIIlIlI;
    private static final String[] IIIlIll;
    private static final Object[] IIIllII;

    public Extinguish I() {
        return this.IlllI;
    }

    public BreachSwap l() {
        return this.llllIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public <T extends ModuleBase> T II(Class<T> clazz) {
        ModuleBase moduleBase;
        ModuleBase moduleBase2 = this.III.get(clazz);
        if (moduleBase2 != null) return (T)((ModuleBase)clazz.cast(moduleBase2));
        Iterator<ModuleBase> iterator = this.lIIlll.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!clazz.isInstance(moduleBase = iterator.next()));
        return (T)((ModuleBase)clazz.cast(moduleBase));
    }

    private static /* synthetic */ void Il(ModuleBase moduleBase, Packet packet) {
        moduleBase.IIlIllI(packet);
    }

    /*
     * Enabled aggressive block sorting
     */
    public ModuleBase lI(String string) {
        ModuleBase moduleBase;
        String string2;
        Object object2;
        if (string == null) return null;
        if (string.isBlank()) {
            return null;
        }
        for (Object object2 : this.lIIlll) {
            if (!((ModuleBase)object2).IlIIIll().Il(string)) continue;
            return object2;
        }
        for (Object object2 : this.lIIlll) {
            if (!((ModuleBase)object2).IIllllI().equalsIgnoreCase(string)) continue;
            return object2;
        }
        String string3 = string.replaceAll("[^A-Za-z0-9_]", "");
        object2 = this.lIIlll.iterator();
        do {
            if (!object2.hasNext()) return null;
        } while (!(string2 = (moduleBase = (ModuleBase)object2.next()).IIllllI().replaceAll("[^A-Za-z0-9_]", "")).equalsIgnoreCase(string3));
        return moduleBase;
    }

    public List<ModuleBase> III(Category category) {
        if (category != Category.lI) {
            return this.lIIlll.stream().filter(moduleBase -> {
                Category category2 = moduleBase.IlIlIIl();
                if (category != Category.IIl) {
                    if (category2 != category) return false;
                    return true;
                }
                if (category2 == Category.IIl) return true;
                if (category2 == Category.lI) return true;
                return false;
            }).sorted(this.IlIlI(category)).toList();
        }
        return Collections.emptyList();
    }

    public Cosmetics IIl() {
        return this.IlIlI;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void IlI(Entity entity, int n) {
        if (entity == null || IIllllllI.I(entity)) {
            return;
        }
        Iterator<ModuleBase> iterator = this.lIllll.iterator();
        boolean bl = true;
        while (true) {
            ModuleBase moduleBase;
            if (!bl || (bl = false) || !true) {
                this.IIlIIlI(moduleBase, 43, () -> moduleBase.IIIllIl(entity, n));
            }
            do {
                if (iterator.hasNext()) continue;
                return;
            } while (!(moduleBase = iterator.next()).IIIlIIl() && moduleBase.lllllI());
        }
    }

    public AutoSafeAnchor Ill() {
        return this.IllllI;
    }

    public Sprint lII() {
        return this.IIIlll;
    }

    public WebAssist lIl() {
        return this.IIIIlIl;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void llI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            return;
        }
        Iterator<ModuleBase> iterator = this.lIllll.iterator();
        boolean bl = true;
        while (true) {
            ModuleBase moduleBase;
            if (!bl || (bl = false) || !true) {
                this.IIlIIlI(moduleBase, 53, () -> moduleBase.IlIlIll(minecraftClient));
            }
            do {
                if (!iterator.hasNext()) return;
            } while (!(moduleBase = iterator.next()).IIIlIIl() && moduleBase.lllllI());
        }
    }

    public AimHelper lll() {
        return AimHelper.lI();
    }

    public ChestStealer IIII() {
        return this.IlIIII;
    }

    public KeyXbow IIIl() {
        return this.IIII;
    }

    private static boolean IIlI(ModuleBase moduleBase, String string) {
        try {
            return moduleBase.getClass().getMethod(string, Packet.class).getDeclaringClass() != ModuleBase.class;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return false;
        }
    }

    private boolean IIll(ModuleBase moduleBase, MinecraftClient minecraftClient, boolean bl) {
        if (!this.lIlIII(moduleBase, minecraftClient)) {
            return false;
        }
        try {
            return moduleBase.llllII(minecraftClient) == bl;
        }
        catch (LinkageError | RuntimeException throwable) {
            moduleBase.IIIIIlI(54, throwable);
            return false;
        }
    }

    public Backtrack IlII() {
        return this.Ill;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void IlIl(Entity entity) {
        if (IIllllllI.I(entity)) {
            return;
        }
        if (lIIllllI.IlIIIII()) {
            if (this.IlIllI == null) return;
            if (!this.IlIllI.IIIlIIl()) return;
            this.IIlIIlI(this.IlIllI, 40, () -> this.IlIllI.I(entity));
            return;
        }
        Iterator<ModuleBase> iterator = this.lIllll.iterator();
        boolean bl = true;
        while (true) {
            ModuleBase moduleBase;
            if (!bl || (bl = false) || !true) {
                this.IIlIIlI(moduleBase, 40, () -> moduleBase.I(entity));
            }
            do {
                if (!iterator.hasNext()) return;
            } while (!(moduleBase = iterator.next()).IIIlIIl() && moduleBase.lllllI());
        }
    }

    public IIlllIll IllI() {
        return this.llllII;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Illl(Entity entity, byte by) {
        if (entity == null) return;
        if (IIllllllI.I(entity)) {
            return;
        }
        Iterator<ModuleBase> iterator = this.lIllll.iterator();
        while (iterator.hasNext()) {
            ModuleBase moduleBase = iterator.next();
            if (!moduleBase.IIIlIIl() && moduleBase.lllllI()) continue;
            this.IIlIIlI(moduleBase, 42, () -> moduleBase.llI(entity, by));
        }
    }

    public ClickCrystal lIII() {
        return this.lIIIl;
    }

    public BowSpam lIIl() {
        return this.lIlIl;
    }

    public List<ModuleBase> lIlI() {
        return Collections.unmodifiableList(this.lIIlll);
    }

    public AutoHitCrystal lIll() {
        return this.ll;
    }

    /*
     * Unable to fully structure code
     */
    public void llII(Packet<?> var1_1) {
        block3: {
            block5: {
                block6: {
                    block4: {
                        if (var1_1 != null) break block4;
                        break block5;
lbl3:
                        // 1 sources

                        while (!var3_3.lllllI()) {
                            break block3;
                        }
                        break block6;
                        while (true) {
                            var3_3 = var2_2.next();
                            if (var3_3.IIIlIIl()) break block3;
                            ** GOTO lbl3
                            break;
                        }
                    }
                    var2_2 = this.lllIll.iterator();
                }
lbl13:
                // 2 sources

                while (true) {
                    if (var2_2.hasNext()) ** continue;
                    return;
                }
            }
            return;
        }
        this.IIlIIlI(var3_3, 22, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, Il(orchard.core.ModuleBase net.minecraft.network.packet.Packet ), ()V)((ModuleBase)var3_3, var1_1));
        ** while (true)
    }

    public HitMarker llIl() {
        return this.IlI;
    }

    public ItemESP lllI() {
        return this.IIIllI;
    }

    public AutoDeposit llll() {
        return this.Il;
    }

    private static /* synthetic */ void IIIII(ModuleBase moduleBase, Entity entity) {
        moduleBase.IlIIlI(entity);
    }

    public FastCart IIIIl() {
        return this.IllIlI;
    }

    public XCarry IIIlI() {
        return this.IIIIl;
    }

    public AutoCrystal IIIll() {
        return this.IlIlll;
    }

    public AutoInventoryTotem IIlII() {
        return this.llIlIl;
    }

    public PlayerFreeze IIlIl() {
        return this.IIIIIIl;
    }

    public TargetHUD IIlll() {
        return this.IIlllI;
    }

    private static /* synthetic */ void IlIII(ModuleBase moduleBase, DrawContext drawContext, int n, int n2, float f) {
        moduleBase.Il(drawContext, n, n2, f);
    }

    public SpearLunge IlIIl() {
        return this.IIIlIl;
    }

    private Comparator<ModuleBase> IlIlI(Category category) {
        return Comparator.comparingInt(moduleBase -> this.lllllI(category, (ModuleBase)moduleBase)).thenComparing(ModuleBase::IIllllI);
    }

    public PlayerHider IlIll() {
        return this.II;
    }

    public Chinahat IllII() {
        return this.lII;
    }

    public Panic IlllI() {
        return this.lIIlII;
    }

    public IIIIll Illll() {
        return this.I;
    }

    public Promo lIIII() {
        return this.lIIlI;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIIIl(InputUtil.Key key) {
        if (this.IlIIll.IIlI(key)) return true;
        if (!this.llIl.IlI(key)) return false;
        return true;
    }

    public NickSwitcher lIIlI() {
        return this.lIIIll;
    }

    public AutoTool lIIll() {
        return this.lllII;
    }

    public ClickSimulations lIlII() {
        return this.llIl;
    }

    public IIIIlII lIlIl() {
        return this.IlIIll;
    }

    public AutoArmor lIllI() {
        return this.IllIll;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lIlll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            return;
        }
        lIIllllI.IIIllI(minecraftClient);
        try {
            for (ModuleBase moduleBase : this.lIllll) {
                if (!this.IIll(moduleBase, minecraftClient, false)) continue;
                this.IIlIIlI(moduleBase, 50, () -> moduleBase.IllIll(minecraftClient));
            }
        }
        finally {
            lIIllllI.IIII();
        }
    }

    public AutoHeadWeb llIII() {
        return this.llIllI;
    }

    public MaceSwap llIIl() {
        return this.IlIIIIl();
    }

    public LegitScaffold llIlI() {
        return this.lIllII;
    }

    /*
     * Unable to fully structure code
     */
    public boolean llIll(double var1_1, double var3_2, int var5_3) {
        block9: {
            block7: {
                block8: {
                    block5: {
                        block6: {
                            var6_4 = MinecraftClient.getInstance();
                            break block6;
lbl3:
                            // 1 sources

                            while (true) {
                                if (var8_6.lllllI()) break block5;
                                while (true) {
                                    if (this.llllII(var8_6, 32, (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lIIlII(orchard.core.ModuleBase double double int ), ()Z)((ModuleBase)var8_6, (double)var1_1, (double)var3_2, (int)var5_3))) {
                                        return true;
                                    }
                                    break block5;
                                    break;
                                }
                                break;
                            }
                        }
                        if (var6_4 != null) break block7;
                        break block8;
                    }
                    --var7_5;
                    break block9;
                }
                return false;
lbl17:
                // 1 sources

                while (true) {
                    if (var8_6.IIIlIIl()) ** continue;
                    ** continue;
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var8_6 = this.lIIlll.get(var7_5);
                    ** continue;
                    break;
                }
            }
            var7_5 = this.lIIlll.size() - 1;
        }
        ** while (var7_5 >= 0)
lbl27:
        // 1 sources

        return false;
    }

    /*
     * Unable to fully structure code
     */
    public void lllII(Packet<?> var1_1) {
        block10: {
            block5: {
                block9: {
                    block8: {
                        block6: {
                            block7: {
                                if (!(var1_1 instanceof UpdateSelectedSlotC2SPacket)) break block6;
                                break block7;
lbl3:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            lIIllllI.III(var1_1);
                            break block8;
                        }
                        if (var1_1 instanceof PlayerMoveC2SPacket) break block9;
                    }
lbl11:
                    // 2 sources

                    while (var1_1 instanceof PlayerInteractEntityC2SPacket) {
                        var2_2 = this.llIIlI.iterator();
                        ** GOTO lbl17
                    }
                    break block10;
lbl15:
                    // 1 sources

                    while (true) {
                        block11: {
                            if (!var3_3.lllllI()) break block11;
lbl17:
                            // 3 sources

                            while (var2_2.hasNext()) {
                                ** continue;
lbl19:
                                // 1 sources

                                ** GOTO lbl3
                            }
                            break block5;
                        }
lbl22:
                        // 2 sources

                        while (true) {
                            this.IIlIIlI(var3_3, 21, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IlIlIIl(orchard.core.ModuleBase net.minecraft.network.packet.Packet ), ()V)((ModuleBase)var3_3, var1_1));
                            ** GOTO lbl17
                            break;
                        }
                        break;
                    }
                }
                IlIlllI.lII(var1_1);
                ** GOTO lbl11
            }
            return;
        }
        return;
        var3_3 = var2_2.next();
        ** while (var3_3.IIIlIIl())
lbl34:
        // 1 sources

        ** while (true)
    }

    public HitWeb lllIl() {
        return this.IIlIlI;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void lllll(DrawContext var1_1, int var2_2, int var3_3, float var4_4) {
        block22: {
            block21: {
                block23: {
                    block25: {
                        block20: {
                            block17: {
                                block18: {
                                    block24: {
                                        block19: {
                                            break block24;
lbl1:
                                            // 3 sources

                                            while (true) {
                                                this.IIlIIlI(this.lIlllI, 31, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IlIlIll(net.minecraft.client.gui.DrawContext int int float ), ()V)((lllIIlI)this, (DrawContext)var1_1, (int)var2_2, (int)var3_3, (float)var4_4));
                                                break block17;
                                                break;
                                            }
                                            while (var6_6) {
                                                break block18;
lbl6:
                                                // 1 sources

                                                while (this.IllIll(var5_5, (ModuleBase)var8_8)) {
                                                    break block19;
lbl8:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                            }
                                            break block25;
lbl12:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            var8_8 = (ModuleBase)var7_7 /* !! */ .next();
                                            if (var8_8 != this.lIlllI) ** GOTO lbl6
                                            break block19;
lbl17:
                                            // 1 sources

                                            while (true) {
                                                if (var8_8.lllllI()) break block19;
                                                break block20;
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (true) {
                                                if (!IIlllIIIl.ll().lI()) break block17;
                                                ** GOTO lbl1
                                                break;
                                            }
                                        }
lbl24:
                                        // 4 sources

                                        while (true) {
                                            if (!var7_7 /* !! */ .hasNext()) break block21;
                                            ** continue;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        return;
lbl29:
                                        // 1 sources

                                        while (true) {
                                            orchard.internal.IIIlI.lIIII(1.0);
                                            ** continue;
                                            break;
                                        }
lbl32:
                                        // 1 sources

                                        while (true) {
                                            v0 = true;
                                            break block22;
                                            break;
                                        }
lbl35:
                                        // 2 sources

                                        while (true) {
                                            v0 = false;
                                            break block22;
                                            break;
                                        }
                                    }
                                    var5_5 = MinecraftClient.getInstance();
                                    ** while (var5_5 != null)
lbl41:
                                    // 1 sources

                                    ** while (true)
                                }
                                if (!(var8_8 instanceof lllIlIII)) break block25;
                                ** GOTO lbl24
                            }
lbl46:
                            // 3 sources

                            return;
lbl48:
                            // 1 sources

                            while (true) {
                                if (this.IllIll(var5_5, this.lIlllI)) ** GOTO lbl46
                                break block23;
                                break;
                            }
                        }
lbl52:
                        // 2 sources

                        while (true) {
                            this.IIlIIlI((ModuleBase)var8_8, 31, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IlIII(orchard.core.ModuleBase net.minecraft.client.gui.DrawContext int int float ), ()V)((ModuleBase)var8_8, (DrawContext)var1_1, (int)var2_2, (int)var3_3, (float)var4_4));
                            ** GOTO lbl24
                            break;
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var7_7 /* !! */  = (lIllIIlI)var8_8;
                            if (var7_7 /* !! */ .Ill() != orchard.internal.Illl.I) ** GOTO lbl35
                            ** continue;
                            break;
                        }
                        IlIlIlI.llIllI(var5_5);
                        var8_8 = var5_5.currentScreen;
                        if (var8_8 instanceof lIllIIlI) ** break;
                        ** while (true)
                        ** while (true)
                    }
                    ** while (var8_8.IIIlIIl())
lbl66:
                    // 1 sources

                    ** while (true)
lbl67:
                    // 1 sources

                    while (true) {
                        if (!this.lIlllI.lllllI()) ** GOTO lbl1
                        ** continue;
                        break;
                    }
                }
                if (!this.lIlllI.IIIlIIl()) ** break;
                ** while (true)
                ** while (true)
            }
            if (!var6_6) ** break;
            ** while (true)
            ** while (true)
        }
        var6_6 = v0;
        var7_7 /* !! */  = this.lIIlll.iterator();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IIIIII(InputUtil.Key key) {
        if (key == null) return "NONE";
        if (key == InputUtil.UNKNOWN_KEY) {
            return "NONE";
        }
        String string = key.getTranslationKey();
        if (string.startsWith("key.keyboard.")) {
            return string.substring(13).toUpperCase(Locale.ROOT);
        }
        if (!string.startsWith("key.mouse.")) return string.toUpperCase(Locale.ROOT);
        String string2 = string.substring(10);
        String string3 = "mouse".toUpperCase(Locale.ROOT);
        return string3 + string2;
    }

    public AutoDrain IIIIIl() {
        return this.IllIl;
    }

    public ShieldBreaker IIIIlI() {
        return this.IlII;
    }

    public PearlChase IIIIll() {
        return this.lIlI;
    }

    public VisualSwitch IIIlII() {
        return this.llllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIIlIl(Packet<?> packet) {
        if (packet == null) {
            return;
        }
        String string = packet.getClass().getSimpleName();
        if (!string.equals("PlayerPositionLookS2CPacket")) {
            if (!string.equals(StringFactory.IIl("qJhVhRxFYhmEGJ5OAeCMvaiVV5ccQw=="))) return;
        }
        lIIllllI.IlIlI();
        IlIlllI.l();
    }

    /*
     * Unable to fully structure code
     */
    public void IIIllI(II var1_1) {
        block5: {
            block6: {
                block7: {
                    block4: {
                        block8: {
                            if (var1_1 != null) break block7;
                            break block8;
lbl3:
                            // 1 sources

                            while (true) {
                                if (var3_3.IIIlIIl()) break block4;
                                break block5;
                                break;
                            }
                        }
                        return;
                    }
lbl9:
                    // 2 sources

                    while (true) {
                        this.IIlIIlI(var3_3, 30, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lIIIll(orchard.core.ModuleBase orchard.internal.II ), ()V)((ModuleBase)var3_3, (II)var1_1));
                        break block6;
                        break;
                    }
                }
                var2_2 = this.lIIlll.iterator();
            }
lbl15:
            // 2 sources

            while (true) {
                if (var2_2.hasNext()) {
                    var3_3 = var2_2.next();
                    ** continue;
                }
                return;
            }
        }
        ** while (var3_3.lllllI())
lbl22:
        // 1 sources

        ** while (true)
    }

    public KeybindsHUD IIIlll() {
        return this.IIlll;
    }

    public Animations IIlIII() {
        return this.llIII;
    }

    public M2DESP IIlIIl() {
        return this.lllIl;
    }

    public List<lllIlIII> IIlIlI() {
        return this.lIlll;
    }

    public AimOptimizer IIllII() {
        return this.IIl;
    }

    public Teams IIllIl() {
        return this.IlIII;
    }

    /*
     * Unable to fully structure code
     */
    public void IIllll(Entity var1_1) {
        block9: {
            block10: {
                block7: {
                    block5: {
                        block4: {
                            block6: {
                                block8: {
                                    if (!IIllllllI.I(var1_1)) break block8;
                                    break block9;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        if (var3_3.IIIlIIl()) break block4;
                                        break block5;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = this.lIllll.iterator();
                                        break block6;
                                        break;
                                    }
                                }
                                this.IlIIl.IIlI(var1_1);
                                ** while (true)
                            }
lbl13:
                            // 3 sources

                            while (var2_2.hasNext()) {
                                break block7;
                            }
                            break block10;
                        }
lbl17:
                        // 2 sources

                        while (true) {
                            this.IIlIIlI(var3_3, 41, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IIIII(orchard.core.ModuleBase net.minecraft.entity.Entity ), ()V)((ModuleBase)var3_3, (Entity)var1_1));
                            ** GOTO lbl13
                            break;
                        }
                    }
                    if (var3_3.lllllI()) ** GOTO lbl13
                    ** while (true)
                }
                var3_3 = var2_2.next();
                ** while (true)
            }
            return;
        }
    }

    public Autoclicker IlIIII() {
        return this.IIIIlll;
    }

    public PlayerLocator IlIIIl() {
        return this.llIIll;
    }

    public FastAnchor IlIIlI() {
        return this.llllll;
    }

    public NoBounce IlIIll() {
        return this.IlIlIl;
    }

    public Interface IlIlIl() {
        return this.lIIIIl;
    }

    public Freecam IlIllI() {
        return this.IIIIIll;
    }

    public ElytraSwap IlIlll() {
        return this.lIII;
    }

    public AimAssist IllIII() {
        return this.lI;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void IllIIl(DrawContext drawContext, int n, int n2, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || drawContext == null) return;
        this.lllll(drawContext, n, n2, f);
    }

    private boolean IllIll(MinecraftClient minecraftClient, ModuleBase moduleBase) {
        lllIlIII lllIlIII2;
        return moduleBase instanceof lllIlIII && IlIIIIII.l(minecraftClient, lllIlIII2 = (lllIlIII)((Object)moduleBase));
    }

    public ModuleList IlllII() {
        return this.lllIII;
    }

    public FakeLag IlllIl() {
        return FakeLag.IIl();
    }

    public Nametags IllllI() {
        return this.IllIIl;
    }

    public Interface lIIIII() {
        return this.lIIIIl;
    }

    public lll lIIIIl() {
        return this.IllII;
    }

    private static /* synthetic */ void lIIIll(ModuleBase moduleBase, II iI) {
        moduleBase.Ill(iI);
    }

    private static /* synthetic */ boolean lIIlII(ModuleBase moduleBase, double d, double d2, int n) {
        return moduleBase.IIlIlIl(d, d2, n);
    }

    public PerfectWindcharge lIIlIl() {
        return this.llIIl;
    }

    public AntiBot lIIllI() {
        return this.lIIII;
    }

    public MoveFix lIIlll() {
        return this.IIlIII;
    }

    private boolean lIlIII(ModuleBase moduleBase, MinecraftClient minecraftClient) {
        try {
            return moduleBase != null && !moduleBase.IIlIlll() && (moduleBase.IIIlIIl() || !moduleBase.lllllI() || moduleBase.IlIlIlI(minecraftClient));
        }
        catch (LinkageError | RuntimeException throwable) {
            if (moduleBase != null) {
                moduleBase.IIIIIlI(52, throwable);
            }
            return false;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean lIlIIl(String var1_1) {
        block112: {
            block157: {
                block154: {
                    block155: {
                        block150: {
                            block111: {
                                block125: {
                                    block142: {
                                        block156: {
                                            block131: {
                                                block116: {
                                                    block141: {
                                                        block95: {
                                                            block151: {
                                                                block122: {
                                                                    block135: {
                                                                        block148: {
                                                                            block132: {
                                                                                block96: {
                                                                                    block120: {
                                                                                        block146: {
                                                                                            block152: {
                                                                                                block149: {
                                                                                                    block118: {
                                                                                                        block139: {
                                                                                                            block117: {
                                                                                                                block128: {
                                                                                                                    block89: {
                                                                                                                        block124: {
                                                                                                                            block113: {
                                                                                                                                block153: {
                                                                                                                                    block126: {
                                                                                                                                        block140: {
                                                                                                                                            block138: {
                                                                                                                                                block98: {
                                                                                                                                                    block129: {
                                                                                                                                                        block145: {
                                                                                                                                                            block127: {
                                                                                                                                                                block100: {
                                                                                                                                                                    block143: {
                                                                                                                                                                        block104: {
                                                                                                                                                                            block130: {
                                                                                                                                                                                block108: {
                                                                                                                                                                                    block123: {
                                                                                                                                                                                        block114: {
                                                                                                                                                                                            block147: {
                                                                                                                                                                                                block109: {
                                                                                                                                                                                                    block110: {
                                                                                                                                                                                                        block133: {
                                                                                                                                                                                                            block94: {
                                                                                                                                                                                                                block144: {
                                                                                                                                                                                                                    block97: {
                                                                                                                                                                                                                        block121: {
                                                                                                                                                                                                                            block115: {
                                                                                                                                                                                                                                block105: {
                                                                                                                                                                                                                                    block106: {
                                                                                                                                                                                                                                        block119: {
                                                                                                                                                                                                                                            block93: {
                                                                                                                                                                                                                                                block103: {
                                                                                                                                                                                                                                                    block91: {
                                                                                                                                                                                                                                                        block99: {
                                                                                                                                                                                                                                                            block92: {
                                                                                                                                                                                                                                                                block101: {
                                                                                                                                                                                                                                                                    block137: {
                                                                                                                                                                                                                                                                        block107: {
                                                                                                                                                                                                                                                                            block136: {
                                                                                                                                                                                                                                                                                block134: {
                                                                                                                                                                                                                                                                                    block102: {
                                                                                                                                                                                                                                                                                        block90: {
                                                                                                                                                                                                                                                                                            if (var1_1 == null) break block133;
                                                                                                                                                                                                                                                                                            break block134;
lbl3:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (!var8_8.equalsIgnoreCase("del")) {
                                                                                                                                                                                                                                                                                                break block89;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            break block131;
                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                if (!var6_18.equalsIgnoreCase("unbind")) break block90;
                                                                                                                                                                                                                                                                                                break block91;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl9:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (!var6_18.equalsIgnoreCase("profiles")) {
                                                                                                                                                                                                                                                                                                break block92;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            break block105;
lbl12:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            return false;
lbl14:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            return true;
lbl16:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            return false;
lbl18:
                                                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                var37_21 = v0;
                                                                                                                                                                                                                                                                                                var36_20 = "[Orchard] ";
                                                                                                                                                                                                                                                                                                lIIIlII.I(var36_20 + var37_21);
                                                                                                                                                                                                                                                                                                break block93;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl23:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                break block94;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl25:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            return true;
lbl27:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                if (!var7_3.isEmpty()) break block95;
                                                                                                                                                                                                                                                                                                break block96;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl30:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                if (!var6_18.equalsIgnoreCase("selfdestruct")) break block97;
                                                                                                                                                                                                                                                                                                break block98;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl33:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            return true;
lbl35:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                if (var2_14.startsWith("/")) break block99;
                                                                                                                                                                                                                                                                                                break block100;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl38:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (!var6_18.equalsIgnoreCase("friend")) {
                                                                                                                                                                                                                                                                                                break block101;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            break block135;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (var6_18.equalsIgnoreCase("config")) break block136;
                                                                                                                                                                                                                                                                                        break block137;
lbl44:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            var7_4 = this.lI(var5_17[1]);
                                                                                                                                                                                                                                                                                            break block102;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl47:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            v1 = ClientEntrypoint.lII().IIl();
                                                                                                                                                                                                                                                                                            break block103;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl50:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        return this.IIIIlII.IIII(var2_14);
lbl52:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            var5_17 = var4_16.split("\\s+", 3);
                                                                                                                                                                                                                                                                                            break block104;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl55:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl57:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            if (var6_18.equalsIgnoreCase(StringFactory.IIl("m5tZkRhZVA8="))) break block105;
                                                                                                                                                                                                                                                                                            ** continue;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl60:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        return true;
lbl62:
                                                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            if (var5_17.length == 1) break block106;
                                                                                                                                                                                                                                                                                            break block107;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl65:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (!var6_18.equalsIgnoreCase("config")) {
                                                                                                                                                                                                                                                                                            break block108;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        break block105;
lbl68:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        return true;
lbl70:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            if (var5_17.length < 3) break block109;
                                                                                                                                                                                                                                                                                            var9_12 = var5_17[2].trim();
                                                                                                                                                                                                                                                                                            if (var9_12.length() > 20) break block110;
lbl74:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (var8_8.equalsIgnoreCase("load")) {
                                                                                                                                                                                                                                                                                                break block111;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            break block112;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl77:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl79:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (var6_18.equalsIgnoreCase("virel")) {
                                                                                                                                                                                                                                                                                            break block113;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        break block138;
lbl82:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            break block114;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    ** while (var7_4 != null)
lbl86:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    break block139;
lbl87:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        if (!var10_39) break block115;
                                                                                                                                                                                                                                                                                        break block116;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
lbl90:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
lbl92:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                ** while (!var1_1.isBlank())
lbl96:
                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                break block133;
lbl97:
                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                    break block117;
                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
lbl100:
                                                                                                                                                                                                                                                                            // 4 sources

                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                if (ClientEntrypoint.lII() != null) {
                                                                                                                                                                                                                                                                                    ** continue;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                break block118;
                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (var5_17.length < 2) break block140;
                                                                                                                                                                                                                                                                        break block141;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (var6_18.equalsIgnoreCase("cfg")) ** GOTO lbl100
                                                                                                                                                                                                                                                                    break block142;
lbl110:
                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                    return true;
lbl112:
                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        break block119;
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
lbl116:
                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (var6_18.equalsIgnoreCase("friends")) break block135;
                                                                                                                                                                                                                                                                break block143;
lbl121:
                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    var27_61 = var9_12;
                                                                                                                                                                                                                                                                    var26_63 = "Failed to load config: ";
                                                                                                                                                                                                                                                                    v2 = var26_63 + var27_61;
                                                                                                                                                                                                                                                                    break block120;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl126:
                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    if (var7_5 != null) break block121;
                                                                                                                                                                                                                                                                    break block122;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl129:
                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    v3 = "Enabled ";
                                                                                                                                                                                                                                                                    break block123;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl132:
                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    if (var5_17.length >= 2) ** continue;
                                                                                                                                                                                                                                                                    break block124;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl135:
                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    var17_25 = this.IIIIII(var9_13.IIIllII());
                                                                                                                                                                                                                                                                    var16_23 = " to ";
                                                                                                                                                                                                                                                                    var15_53 = var9_13.IIllllI();
                                                                                                                                                                                                                                                                    var7_3.add(var15_53 + var16_23 + var17_25);
                                                                                                                                                                                                                                                                    break block125;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl142:
                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    var34_67 = v4;
                                                                                                                                                                                                                                                                    var33_66 = "[Orchard] ";
                                                                                                                                                                                                                                                                    lIIIlII.I(var33_66 + var34_67);
                                                                                                                                                                                                                                                                    ** continue;
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl147:
                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    if (var3_15) break block105;
                                                                                                                                                                                                                                                                    ** GOTO lbl65
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
lbl150:
                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                    if (var6_18.equalsIgnoreCase(StringFactory.IIl("iIZbmhBbVQ=="))) break block105;
                                                                                                                                                                                                                                                                    ** GOTO lbl9
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (var6_18.equalsIgnoreCase(StringFactory.IIl("mp1amA=="))) break block105;
                                                                                                                                                                                                                                                            break block144;
lbl156:
                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                var25_69 = v5;
                                                                                                                                                                                                                                                                var24_72 = "Configs: ";
                                                                                                                                                                                                                                                                var23_44 = "[Orchard] ";
                                                                                                                                                                                                                                                                lIIIlII.I(var23_44 + var24_72 + var25_69);
                                                                                                                                                                                                                                                                ** continue;
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                            }
lbl162:
                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
lbl165:
                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            var3_15 = var2_14.startsWith(".");
                                                                                                                                                                                                                                                            ** continue;
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

                                                                                                                                                                                                                                                        while (var5_17.length >= 2) {
                                                                                                                                                                                                                                                            break block126;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        break block145;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    ** while (var5_17.length >= 2)
lbl175:
                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                    ** while (true)
                                                                                                                                                                                                                                                }
lbl177:
                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                }
lbl179:
                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                while (var8_8.equalsIgnoreCase("export")) {
                                                                                                                                                                                                                                                    break block127;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                break block146;
lbl182:
                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                    var17_25 = v6;
                                                                                                                                                                                                                                                    var16_23 = "[Orchard] ";
                                                                                                                                                                                                                                                    lIIIlII.I(var16_23 + var17_25);
                                                                                                                                                                                                                                                    ** continue;
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                }
lbl187:
                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                    var36_20 = var9_12;
                                                                                                                                                                                                                                                    var35_19 = "Failed to export config: ";
                                                                                                                                                                                                                                                    v0 = var35_19 + var36_20;
                                                                                                                                                                                                                                                    ** GOTO lbl18
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            return true;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        var7_6 = this.lI(var5_17[1]);
                                                                                                                                                                                                                                        ** while (var7_6 != null)
lbl197:
                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                        ** while (true)
lbl198:
                                                                                                                                                                                                                                        // 3 sources

                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        }
lbl200:
                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                            if (!var6_18.equalsIgnoreCase("b")) ** continue;
                                                                                                                                                                                                                                            ** GOTO lbl62
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
lbl204:
                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
lbl207:
                                                                                                                                                                                                                                // 7 sources

                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    if (var6_18.equalsIgnoreCase("help")) ** GOTO lbl198
                                                                                                                                                                                                                                    break block128;
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var33_66 = var9_12;
                                                                                                                                                                                                                            var32_65 = "Failed to delete config: ";
                                                                                                                                                                                                                            v4 = var32_65 + var33_66;
                                                                                                                                                                                                                            ** GOTO lbl142
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (var5_17.length >= 3) break block147;
                                                                                                                                                                                                                        ** while (true)
lbl218:
                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                            v5 = "None";
                                                                                                                                                                                                                            ** GOTO lbl156
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                        }
lbl221:
                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                        while (var6_18.equalsIgnoreCase("t")) {
                                                                                                                                                                                                                            ** GOTO lbl132
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        break block148;
lbl224:
                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                        return var3_15;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    ** while (!var3_15)
lbl228:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    ** while (true)
                                                                                                                                                                                                                    var7_2 = new CloudConfigManager(v1);
                                                                                                                                                                                                                    if (var5_17.length == 1) break block149;
                                                                                                                                                                                                                    ** GOTO lbl170
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (var6_18.equalsIgnoreCase("unbind")) ** GOTO lbl207
                                                                                                                                                                                                                break block150;
lbl235:
                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                return true;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var2_14 = var1_1.trim();
                                                                                                                                                                                                            ** while (var2_14.startsWith((String)"."))
lbl240:
                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                            ** while (true)
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return false;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var9_12 = var9_12.substring(0, 20);
                                                                                                                                                                                                    ** GOTO lbl74
                                                                                                                                                                                                }
                                                                                                                                                                                                var29_76 = " <name>";
                                                                                                                                                                                                var28_84 = var8_8;
                                                                                                                                                                                                var27_62 = " ";
                                                                                                                                                                                                var26_64 = var6_18;
                                                                                                                                                                                                var25_70 = ".";
                                                                                                                                                                                                var24_73 = "[Orchard] ";
                                                                                                                                                                                                lIIIlII.I(var24_73 + var25_70 + var26_64 + var27_62 + var28_84 + var29_76);
                                                                                                                                                                                                ** while (true)
                                                                                                                                                                                            }
                                                                                                                                                                                            var8_10 = this.lIllll(var5_17[2]);
                                                                                                                                                                                            break block151;
                                                                                                                                                                                        }
                                                                                                                                                                                        var7_4.IIIIIll(InputUtil.UNKNOWN_KEY);
                                                                                                                                                                                        var24_74 = var7_4.IIllllI();
                                                                                                                                                                                        var23_45 = "Unbound ";
                                                                                                                                                                                        var22_49 = "[Orchard] ";
                                                                                                                                                                                        lIIIlII.I(var22_49 + var23_45 + var24_74);
                                                                                                                                                                                        ** while (true)
lbl265:
                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            if (var9_13.IIIIIII()) {
                                                                                                                                                                                                ** continue;
                                                                                                                                                                                            }
                                                                                                                                                                                            break block125;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
lbl270:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        var16_24 = var7_6.IIllllI();
                                                                                                                                                                                        var15_54 = v3;
                                                                                                                                                                                        var14_57 = "[Orchard] ";
                                                                                                                                                                                        lIIIlII.I(var14_57 + var15_54 + var16_24);
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
lbl276:
                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                    while (var6_18.equalsIgnoreCase("commands")) {
                                                                                                                                                                                        ** GOTO lbl198
                                                                                                                                                                                    }
                                                                                                                                                                                    break block152;
                                                                                                                                                                                    var21_27 = this.IIIIII(var7_5.IIIllII());
                                                                                                                                                                                    var20_31 = " to ";
                                                                                                                                                                                    var19_34 = var7_5.IIllllI();
                                                                                                                                                                                    var18_37 = "[Orchard] ";
                                                                                                                                                                                    lIIIlII.I(var18_37 + var19_34 + var20_31 + var21_27);
                                                                                                                                                                                    return true;
lbl285:
                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                    while (!var6_18.equalsIgnoreCase("gui")) {
                                                                                                                                                                                        break block129;
                                                                                                                                                                                    }
                                                                                                                                                                                    break block113;
                                                                                                                                                                                }
                                                                                                                                                                                if (var6_18.equalsIgnoreCase("cfg")) ** GOTO lbl207
                                                                                                                                                                                ** while (true)
lbl291:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    if (var6_18.equalsIgnoreCase("unload")) break block98;
                                                                                                                                                                                    ** continue;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl294:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    var7_7.III();
                                                                                                                                                                                    break block130;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl297:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (!var6_18.equalsIgnoreCase("orchard")) {
                                                                                                                                                                                    ** GOTO lbl79
                                                                                                                                                                                }
                                                                                                                                                                                break block113;
lbl300:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    var30_77 = var9_12;
                                                                                                                                                                                    var29_75 = "Failed to save config: ";
                                                                                                                                                                                    v7 = var29_75 + var30_77;
                                                                                                                                                                                    ** GOTO lbl162
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            return true;
                                                                                                                                                                        }
                                                                                                                                                                        var6_18 = var5_17[0].toLowerCase(Locale.ROOT);
                                                                                                                                                                        ** GOTO lbl38
                                                                                                                                                                    }
                                                                                                                                                                    if (!var3_15) ** GOTO lbl147
                                                                                                                                                                    break block153;
lbl314:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        if (var6_18.equalsIgnoreCase("help")) ** GOTO lbl207
                                                                                                                                                                        ** continue;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    var23_43 = " <module>";
                                                                                                                                                                    var22_48 = "unbind";
                                                                                                                                                                    var21_28 = ".";
                                                                                                                                                                    var20_32 = "[Orchard] ";
                                                                                                                                                                    lIIIlII.I(var20_32 + var21_28 + var22_48 + var23_43);
                                                                                                                                                                    return true;
                                                                                                                                                                    var31_78 = v7;
                                                                                                                                                                    var30_77 = "[Orchard] ";
                                                                                                                                                                    lIIIlII.I(var30_77 + var31_78);
                                                                                                                                                                    return true;
lbl327:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (var8_11.isEmpty()) {
                                                                                                                                                                        ** continue;
lbl329:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        ** GOTO lbl218
                                                                                                                                                                    }
                                                                                                                                                                    break block154;
lbl331:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        var35_19 = var9_12;
                                                                                                                                                                        var34_68 = "Config exported: ";
                                                                                                                                                                        v0 = var34_68 + var35_19;
                                                                                                                                                                        ** continue;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                return false;
                                                                                                                                                            }
                                                                                                                                                            var10_42 = var7_2.llll(var9_12);
                                                                                                                                                            ** while (!var10_42)
lbl341:
                                                                                                                                                            // 1 sources

                                                                                                                                                            ** while (true)
                                                                                                                                                        }
lbl343:
                                                                                                                                                        // 2 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            var8_8 = var5_17[1].toLowerCase(Locale.ROOT);
                                                                                                                                                            ** continue;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (var6_18.equalsIgnoreCase("menu")) break block113;
                                                                                                                                                    ** GOTO lbl297
lbl349:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (var8_8.equalsIgnoreCase("delete")) break block131;
                                                                                                                                                        ** GOTO lbl3
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
lbl353:
                                                                                                                                                // 2 sources

                                                                                                                                                while (true) {
                                                                                                                                                    IlllIllI.l(MinecraftClient.getInstance(), this);
                                                                                                                                                    ** continue;
                                                                                                                                                    break;
                                                                                                                                                }
lbl357:
                                                                                                                                                // 1 sources

                                                                                                                                                while (true) {
                                                                                                                                                    if (var7_7 == null) ** continue;
                                                                                                                                                    ** continue;
                                                                                                                                                    break;
                                                                                                                                                }
lbl360:
                                                                                                                                                // 1 sources

                                                                                                                                                while (var6_18.equalsIgnoreCase("profiles")) {
                                                                                                                                                    ** GOTO lbl100
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl285
                                                                                                                                            }
                                                                                                                                            ** while (var6_18.equalsIgnoreCase((String)"panic"))
lbl365:
                                                                                                                                            // 1 sources

                                                                                                                                            ** while (true)
                                                                                                                                        }
lbl367:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            var7_5 = this.lI(var5_17[1]);
                                                                                                                                            ** continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    ** while (!var5_17[1].equalsIgnoreCase((String)"list"))
lbl372:
                                                                                                                                    // 1 sources

                                                                                                                                    break block149;
                                                                                                                                }
                                                                                                                                if (var6_18.equalsIgnoreCase("f")) ** break;
                                                                                                                                ** while (true)
                                                                                                                                break block135;
                                                                                                                                var12_81 = "Available commands: .help, .toggle <mod>, .bind <mod> <key>, .unbind <mod>, .friend <add|remove|list> <name>, .config <list|load|save|delete|export> <name>, .gui, .unload";
                                                                                                                                var11_83 = "[Orchard] ";
                                                                                                                                lIIIlII.I(var11_83 + var12_81);
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                            var7_7 = ClientEntrypoint.lII();
                                                                                                                            ** while (true)
                                                                                                                        }
                                                                                                                        var15_55 = " <module>";
                                                                                                                        var14_58 = "toggle";
                                                                                                                        var13_60 = ".";
                                                                                                                        var12_82 = "[Orchard] ";
                                                                                                                        lIIIlII.I(var12_82 + var13_60 + var14_58 + var15_55);
                                                                                                                        return true;
                                                                                                                        var7_3 = new ArrayList<String>();
                                                                                                                        var8_9 = this.lIIlll.iterator();
                                                                                                                        break block125;
                                                                                                                    }
                                                                                                                    if (!var8_8.equalsIgnoreCase("remove")) ** GOTO lbl179
                                                                                                                    break block131;
                                                                                                                }
                                                                                                                if (!var6_18.equalsIgnoreCase("h")) ** break;
                                                                                                                ** while (true)
                                                                                                                ** GOTO lbl276
                                                                                                                var4_16 = var2_14.substring(1).trim();
                                                                                                                ** while (!var4_16.isEmpty())
lbl403:
                                                                                                                // 1 sources

                                                                                                                ** while (true)
lbl404:
                                                                                                                // 1 sources

                                                                                                                return true;
                                                                                                            }
                                                                                                            var7_6.llllIl();
                                                                                                            if (!var7_6.IIIlIIl()) break block155;
                                                                                                            ** while (true)
lbl410:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                if (var6_18.equalsIgnoreCase("orchard")) ** GOTO lbl207
                                                                                                                break block132;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var23_46 = var5_17[1];
                                                                                                        var22_50 = "Unknown module: ";
                                                                                                        var21_29 = "[Orchard] ";
                                                                                                        lIIIlII.I(var21_29 + var22_50 + var23_46);
                                                                                                        ** while (true)
                                                                                                    }
                                                                                                    v1 = new LegacyConfigMigration();
                                                                                                    ** while (true)
                                                                                                }
                                                                                                var8_11 = var7_2.ll();
                                                                                                ** GOTO lbl327
                                                                                            }
                                                                                            if (!var6_18.equalsIgnoreCase("toggle")) ** break;
                                                                                            ** while (true)
                                                                                            ** GOTO lbl221
                                                                                        }
                                                                                        return true;
                                                                                    }
lbl432:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var28_85 = v2;
                                                                                        var27_61 = "[Orchard] ";
                                                                                        lIIIlII.I(var27_61 + var28_85);
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                v6 = "None";
                                                                                ** GOTO lbl182
                                                                            }
                                                                            if (var6_18.equalsIgnoreCase(StringFactory.IIl("jp1GmRU="))) ** GOTO lbl207
                                                                            ** while (true)
                                                                        }
                                                                        if (!var6_18.equalsIgnoreCase("bind")) ** break;
                                                                        ** while (true)
                                                                        ** while (true)
                                                                    }
                                                                    if (this.IIIIlII != null) {
                                                                        ** continue;
                                                                    }
                                                                    break block156;
                                                                }
                                                                var19_35 = var5_17[1];
                                                                var18_38 = "Unknown module: ";
                                                                var17_26 = "[Orchard] ";
                                                                lIIIlII.I(var17_26 + var18_38 + var19_35);
                                                                return true;
                                                                var15_52 = var5_17[1];
                                                                var14_56 = "Unknown module: ";
                                                                var13_59 = "[Orchard] ";
                                                                lIIIlII.I(var13_59 + var14_56 + var15_52);
                                                                return true;
                                                            }
                                                            var7_5.IIIIIll(var8_10);
                                                            break block157;
                                                        }
                                                        v6 = String.join((CharSequence)", ", var7_3);
                                                        ** while (true)
                                                    }
                                                    ** while (!var5_17[1].equalsIgnoreCase((String)"list"))
lbl470:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                var32_65 = var9_12;
                                                var31_79 = "Config deleted: ";
                                                v4 = var31_79 + var32_65;
                                                ** while (true)
                                            }
                                            var10_39 = var7_2.lll(var9_12);
                                            ** while (true)
                                        }
                                        return var3_15;
                                    }
                                    if (!var6_18.equalsIgnoreCase("profile")) ** break;
                                    ** while (true)
                                    ** GOTO lbl360
lbl485:
                                    // 1 sources

                                    while (true) {
                                        var29_75 = var9_12;
                                        var28_86 = "Config saved: ";
                                        v7 = var28_86 + var29_75;
                                        ** continue;
                                        break;
                                    }
lbl490:
                                    // 1 sources

                                    while (true) {
                                        var26_63 = var9_12;
                                        var25_71 = "Config loaded: ";
                                        v2 = var25_71 + var26_63;
                                        ** continue;
                                        break;
                                    }
                                    var38_80 = "Unknown command. Type .help for a list of commands.";
                                    var37_22 = "[Orchard] ";
                                    lIIIlII.I(var37_22 + var38_80);
                                    return true;
                                }
                                ** while (!var8_9.hasNext())
lbl501:
                                // 1 sources

                                var9_13 = var8_9.next();
                                ** while (true)
                            }
                            var10_41 = var7_2.I(var9_12, this);
                            ** while (!var10_41)
lbl506:
                            // 1 sources

                            ** while (true)
                        }
                        if (!var6_18.equalsIgnoreCase(StringFactory.IIl("jJtTmxVS"))) ** break;
                        ** while (true)
                        ** while (true)
                    }
                    v3 = "Disabled ";
                    ** while (true)
                }
                v5 = String.join((CharSequence)", ", var8_11);
                ** while (true)
            }
            var23_47 = this.IIIIII(var8_10);
            var22_51 = " to ";
            var21_30 = var7_5.IIllllI();
            var20_33 = "Bound ";
            var19_36 = "[Orchard] ";
            lIIIlII.I(var19_36 + var20_33 + var21_30 + var22_51 + var23_47);
            return true;
        }
        ** while (!var8_8.equalsIgnoreCase((String)"save"))
lbl527:
        // 1 sources

        ** while (true)
        var10_40 = var7_2.IIII(var9_12, this);
        ** while (!var10_40)
lbl530:
        // 1 sources

        ** while (true)
    }

    public StrayUtils lIlIlI() {
        return this.IIlIl;
    }

    /*
     * Unable to fully structure code
     */
    public void lIllII(Packet<?> var1_1) {
        block7: {
            block6: {
                block10: {
                    block8: {
                        block5: {
                            block9: {
                                if (var1_1 != null) break block8;
                                break block9;
lbl3:
                                // 1 sources

                                while (true) {
                                    if (var3_3.lllllI()) ** GOTO lbl17
                                    break block5;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (!(var1_1 instanceof PlayerInteractEntityC2SPacket)) {
                                    if (var1_1 instanceof PlayerInteractItemC2SPacket) break block6;
lbl8:
                                    // 3 sources

                                    while (true) {
                                        var2_2 = this.IIlIIl.iterator();
                                        ** GOTO lbl17
                                        break;
                                    }
                                }
                                break block6;
                            }
                            return;
                        }
lbl15:
                        // 2 sources

                        while (true) {
                            this.IIlIIlI(var3_3, 20, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IIIIIlI(orchard.core.ModuleBase net.minecraft.network.packet.Packet ), ()V)((ModuleBase)var3_3, var1_1));
lbl17:
                            // 3 sources

                            if (var2_2.hasNext()) {
                                continue;
                            }
                            break block7;
                            break;
                        }
                    }
                    if (var1_1 instanceof UpdateSelectedSlotC2SPacket) break block10;
                    if (var1_1 instanceof PlayerInteractBlockC2SPacket) break block6;
                    ** GOTO lbl6
                }
                lIIllllI.IlIIlII(var1_1);
                ** GOTO lbl8
            }
            lIIllllI.IlIIlI(var1_1);
            ** while (true)
            ** while ((var3_3 = var2_2.next()).IIIlIIl())
lbl31:
            // 1 sources

            ** while (true)
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lIllIl(ModuleBase moduleBase, ModuleBase moduleBase2) {
        int n = Integer.compare(this.IIIllIl(moduleBase2), this.IIIllIl(moduleBase));
        if (n == 0) return Integer.compare(this.IlIIlI.getOrDefault(moduleBase, Integer.MAX_VALUE), this.IlIIlI.getOrDefault(moduleBase2, Integer.MAX_VALUE));
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private <T extends ModuleBase> T lIlllI(T t) {
        t.IIllIII();
        this.IlIIlI.put(t, this.IIIIIII++);
        this.lIIlll.add(t);
        if (t instanceof lllIlIII) {
            lllIlIII lllIlIII2 = (lllIlIII)((Object)t);
            this.lIlIlI.add(lllIlIII2);
        }
        this.III.putIfAbsent(t.getClass(), t);
        this.lIllll.add(t);
        if (lllIIlI.IIlI(t, "onPacketSendQueued")) {
            this.IIlIIl.add(t);
        }
        if (lllIIlI.IIlI(t, "onPacketSendPre")) {
            this.lllIll.add(t);
        }
        if (lllIIlI.IIlI(t, "onPacketSent")) {
            this.llIIlI.add(t);
        }
        this.lIllll.sort(this::lIllIl);
        return t;
    }

    private InputUtil.Key lIllll(String string) {
        InputUtil.Key key;
        if (string == null || string.isBlank() || string.equalsIgnoreCase("None") || string.equalsIgnoreCase("NONE") || string.equalsIgnoreCase("clear")) {
            return InputUtil.UNKNOWN_KEY;
        }
        String string2 = string.toLowerCase(Locale.ROOT);
        if (string2.startsWith("mouse") || string2.startsWith("m")) {
            try {
                int n;
                String string3 = string2.replaceAll("\\D", "");
                if (!string3.isEmpty() && (n = Integer.parseInt(string3)) >= 1 && n <= 8) {
                    return lIIllllI.lllII(n - 1);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (string2.equalsIgnoreCase("middle")) {
            return lIIllllI.lllII(2);
        }
        if (string2.equalsIgnoreCase("left")) {
            return lIIllllI.lllII(0);
        }
        if (string2.equalsIgnoreCase("right")) {
            return lIIllllI.lllII(1);
        }
        if (string.length() == 1) {
            char c = Character.toUpperCase(string.charAt(0));
            if (c >= 'A' && c <= 'Z') {
                return lIIllllI.IlIIIll(65 + (c - 65));
            }
            if (c >= '0' && c <= '9') {
                return lIIllllI.IlIIIll(48 + (c - 48));
            }
        }
        try {
            key = InputUtil.fromTranslationKey((String)string);
            if (key != null && key != InputUtil.UNKNOWN_KEY) {
                return key;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            String string4 = string2;
            String string5 = "key.keyboard.";
            key = InputUtil.fromTranslationKey((String)(string5 + string4));
            if (key != null && key != InputUtil.UNKNOWN_KEY) {
                return key;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return InputUtil.UNKNOWN_KEY;
    }

    public Rotations llIIII() {
        return this.lIlIIl;
    }

    public KillAura llIIIl() {
        return this.lIl;
    }

    public AutoPlay llIIlI() {
        return this.IIIlIII;
    }

    public lIlIIlII llIIll() {
        return this.llIIIl;
    }

    public AutoDhand llIlII() {
        return this.Illlll;
    }

    public StorageESP llIlIl() {
        return this.lllI;
    }

    public AutoCart llIlll() {
        return this.IIIIIlI;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            return;
        }
        lIIllllI.lIIII(minecraftClient);
        boolean bl = false;
        for (ModuleBase moduleBase : this.lIllll) {
            if (!this.IIll(moduleBase, minecraftClient, true)) continue;
            bl = true;
            break;
        }
        if (bl) {
            lIIllllI.IIIllI(minecraftClient);
            try {
                for (ModuleBase moduleBase : this.lIllll) {
                    if (!this.IIll(moduleBase, minecraftClient, true)) continue;
                    this.IIlIIlI(moduleBase, 50, () -> moduleBase.IllIll(minecraftClient));
                }
            }
            finally {
                lIIllllI.IIII();
            }
        }
        try {
            for (ModuleBase moduleBase : this.lIllll) {
                if (!this.lIlIII(moduleBase, minecraftClient)) continue;
                this.IIlIIlI(moduleBase, 51, () -> moduleBase.lIIII(minecraftClient));
            }
        }
        finally {
            try {
                lIIllllI.Illl(minecraftClient, IIllllll.l);
            }
            finally {
                lIIllllI.IllIIll();
            }
        }
    }

    public Xray lllIIl() {
        return this.lll;
    }

    public IIIl lllIlI() {
        return this.IIIII;
    }

    public PotAssist lllIll() {
        return this.IlIlII;
    }

    private boolean llllII(ModuleBase moduleBase, int n, BooleanSupplier booleanSupplier) {
        if (moduleBase == null || booleanSupplier == null || moduleBase.IIlIlll()) {
            return false;
        }
        try {
            return booleanSupplier.getAsBoolean();
        }
        catch (LinkageError | RuntimeException throwable) {
            moduleBase.IIIIIlI(n, throwable);
            return false;
        }
    }

    public NoMissDelay llllIl() {
        return this.IlIll;
    }

    private int lllllI(Category category, ModuleBase moduleBase) {
        return 1;
    }

    public CartProtection llllll() {
        return this.lIIllI;
    }

    public SprintReset2 IIIIIII() {
        return this.IlIllI;
    }

    public FastXP IIIIIIl() {
        return this.IlIIIl;
    }

    private static /* synthetic */ void IIIIIlI(ModuleBase moduleBase, Packet packet) {
        moduleBase.IllIl(packet);
    }

    public List<ModuleBase> IIIIIll() {
        return this.lIIlll.stream().toList();
    }

    public IIIIIIll IIIIlII() {
        return this.lIIIlI;
    }

    public Opsec IIIIlIl() {
        return this.IIIIlI;
    }

    public JumpReset IIIIlll() {
        return this.lIlIll;
    }

    public FakeClient IIIlIII() {
        return this.IIllll;
    }

    public StreamerMode IIIlIIl() {
        return this.IIIlI;
    }

    public AutoReconnect IIIlIlI() {
        return this.llIlII;
    }

    public UnloadOrchard IIIlIll() {
        return this.llIll;
    }

    public Parkour IIIllII() {
        return this.IIIIllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIllIl(ModuleBase moduleBase) {
        if (moduleBase instanceof AutoDhand) {
            return 2995;
        }
        if (moduleBase instanceof AutoInventoryTotem) {
            return 2991;
        }
        if (moduleBase instanceof AutoTotem) {
            return 2990;
        }
        if (moduleBase instanceof Teams) {
            return 2985;
        }
        if (moduleBase instanceof SpearLunge) {
            return 2980;
        }
        if (moduleBase instanceof AutoMace) {
            return 2975;
        }
        if (moduleBase instanceof MaceSwap) {
            return 2974;
        }
        if (moduleBase instanceof BreachSwap) {
            return 2973;
        }
        if (moduleBase instanceof ShieldBreaker) {
            return 2965;
        }
        if (moduleBase instanceof FastAnchor) {
            return 2950;
        }
        if (moduleBase instanceof AirAnchor) {
            return 2949;
        }
        if (moduleBase instanceof FastCart) {
            return 2945;
        }
        if (moduleBase instanceof AutoCart) {
            return 2943;
        }
        if (moduleBase instanceof KeyXbow) {
            return 2942;
        }
        if (moduleBase instanceof AutoCrystal) {
            return 2945;
        }
        if (moduleBase instanceof ClickCrystal) {
            return 2940;
        }
        if (moduleBase instanceof AutoHitCrystal) {
            return 2938;
        }
        if (moduleBase instanceof lIlIIlII) {
            return 2930;
        }
        if (moduleBase instanceof PotAssist) {
            return 2928;
        }
        if (moduleBase instanceof FastXP) {
            return 2927;
        }
        if (moduleBase instanceof NoMissDelay) {
            return 2926;
        }
        if (moduleBase instanceof AimAssist) {
            return 2920;
        }
        if (moduleBase instanceof AimOptimizer) {
            return 2915;
        }
        if (moduleBase instanceof KillAura) {
            return 2910;
        }
        if (moduleBase instanceof rIZdmx5SQj6YHA) {
            return 2900;
        }
        if (moduleBase instanceof Backtrack) {
            return 2895;
        }
        if (moduleBase instanceof Autoclicker) {
            return 2890;
        }
        if (moduleBase instanceof PingSpoof) {
            return 2840;
        }
        if (moduleBase instanceof Sprint) {
            return 2810;
        }
        if (moduleBase instanceof Speed) {
            return 2800;
        }
        if (moduleBase instanceof CollisionSpeed) {
            return 2795;
        }
        if (moduleBase instanceof NoJumpDelay) {
            return 2798;
        }
        if (moduleBase instanceof JumpReset) {
            return 2790;
        }
        if (moduleBase instanceof Parkour) {
            return 2770;
        }
        if (moduleBase instanceof PerfectWindcharge) {
            return 2765;
        }
        if (moduleBase instanceof LegitScaffold) {
            return 2760;
        }
        if (moduleBase instanceof SnapTap) {
            return 2750;
        }
        if (moduleBase instanceof FastPlace) {
            return 2740;
        }
        if (moduleBase instanceof NoPush) {
            return 2730;
        }
        if (moduleBase instanceof AutoWalk) {
            return 2720;
        }
        if (moduleBase instanceof VClip) {
            return 2710;
        }
        if (moduleBase instanceof AutoArmor) {
            return 2700;
        }
        if (moduleBase instanceof IIlllIll) {
            return 2995;
        }
        if (moduleBase instanceof IIIl) {
            return 2690;
        }
        if (moduleBase instanceof IIIIIIll) {
            return 2692;
        }
        if (moduleBase instanceof IIIIll) {
            return 2693;
        }
        if (moduleBase instanceof AutoDrain) {
            return 2687;
        }
        if (moduleBase instanceof InventoryCleaner) {
            return 2689;
        }
        if (moduleBase instanceof AutoDeposit) {
            return 2691;
        }
        if (moduleBase instanceof ChestStealer) {
            return 2688;
        }
        if (moduleBase instanceof XCarry) {
            return 2680;
        }
        if (moduleBase instanceof AutoTool) {
            return 2885;
        }
        if (moduleBase instanceof FakeHacker) {
            return 825;
        }
        if (moduleBase instanceof RangeFinder) {
            return 823;
        }
        if (moduleBase instanceof Glow) {
            return 822;
        }
        if (moduleBase instanceof StrayUtils) {
            return 2650;
        }
        if (moduleBase instanceof AutoGG) {
            return 2640;
        }
        if (moduleBase instanceof FakePlayer) {
            return 2620;
        }
        if (moduleBase instanceof PearlChase) {
            return 2600;
        }
        if (moduleBase instanceof Friends) {
            return 995;
        }
        if (moduleBase instanceof lllIlIII) {
            return 900;
        }
        if (moduleBase instanceof Trajectories) {
            return 895;
        }
        if (moduleBase instanceof Animations) {
            return 890;
        }
        if (moduleBase instanceof PopVisuals) {
            return 870;
        }
        if (moduleBase instanceof PlayerLocator) {
            return 830;
        }
        if (moduleBase instanceof M2DESP) {
            return 820;
        }
        if (moduleBase instanceof Nametags) {
            return 810;
        }
        if (moduleBase instanceof AutoReconnect) {
            return 790;
        }
        if (moduleBase instanceof TargetHUD) {
            return 780;
        }
        if (moduleBase instanceof Chinahat) {
            return 775;
        }
        if (moduleBase instanceof KeybindsHUD) {
            return 770;
        }
        if (moduleBase instanceof FPS) {
            return 763;
        }
        if (moduleBase instanceof BPS) {
            return 762;
        }
        if (moduleBase instanceof Notifications) {
            return 760;
        }
        if (moduleBase instanceof ModuleList) {
            return 750;
        }
        if (moduleBase instanceof Watermark) {
            return 740;
        }
        if (moduleBase instanceof Freecam) {
            return 728;
        }
        if (moduleBase instanceof PlayerHider) {
            return 720;
        }
        if (moduleBase instanceof NickSwitcher) {
            return 710;
        }
        if (moduleBase instanceof Cosmetics) {
            return 700;
        }
        if (moduleBase instanceof FakeClient) {
            return 690;
        }
        if (moduleBase.IlIlIIl() == Category.l) return 700;
        if (moduleBase.IlIlIIl() != Category.I) return moduleBase.IIll();
        return 700;
    }

    public AutoMace IIIlllI() {
        return this.lllIIl;
    }

    private /* synthetic */ void IIIllll(MinecraftClient minecraftClient) {
        this.llIl.IIIIl(minecraftClient);
    }

    /*
     * Unable to fully structure code
     */
    public void IIlIIII() {
        block4: {
            block6: {
                block5: {
                    break block5;
lbl1:
                    // 1 sources

                    while (true) {
                        this.IIlIIlI(var3_3, 10, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, III(), ()V)((ModuleBase)var3_3));
lbl3:
                        // 3 sources

                        while (!var2_2.hasNext()) {
                            return;
                        }
                        break block4;
                        break;
                    }
                }
                var1_1 = MinecraftClient.getInstance();
                break block6;
lbl9:
                // 1 sources

                while (this.lIlIII(var3_3, var1_1)) {
                    ** continue;
lbl11:
                    // 1 sources

                    ** GOTO lbl1
                }
                ** GOTO lbl3
lbl13:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            lIIllllI.IIlI(var1_1);
            this.IlIIll.lII(var1_1);
            ** while (true)
            this.IIlIIlI(this.llIl, 10, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IIIllll(net.minecraft.client.MinecraftClient ), ()V)((lllIIlI)this, (MinecraftClient)var1_1));
            var2_2 = this.lIllll.iterator();
            ** GOTO lbl3
        }
        var3_3 = var2_2.next();
        ** GOTO lbl9
    }

    public Speed IIlIIIl() {
        return this.lIIlIl;
    }

    private void IIlIIlI(ModuleBase moduleBase, int n, Runnable runnable) {
        if (moduleBase == null || runnable == null || moduleBase.IIlIlll()) {
            return;
        }
        try {
            runnable.run();
        }
        catch (LinkageError | RuntimeException throwable) {
            moduleBase.IIIIIlI(n, throwable);
        }
    }

    public AirAnchor IIlIIll() {
        return this.IIIIll;
    }

    public AutoTotem IIlIlII() {
        return this.llll;
    }

    public Glow IIlIlIl() {
        return this.lIIl;
    }

    public FullBright IIlIllI() {
        return this.llI;
    }

    public lIlIIlII IIlIlll() {
        return this.llIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public lllIIlI(IlIlIlIII ilIlIlIII) {
        this.IIlIIl = new ArrayList<ModuleBase>();
        this.lllIll = new ArrayList<ModuleBase>();
        this.llIIlI = new ArrayList<ModuleBase>();
        this.lIlIlI = new ArrayList<lllIlIII>();
        this.lIlll = Collections.unmodifiableList(this.lIlIlI);
        this.III = new HashMap();
        this.IlIIlI = new HashMap<ModuleBase, Integer>();
        this.IIIIII = new HashMap<ModuleBase, Boolean>();
        this.IlIIll = orchard.internal.IIIIlII.IlI();
        this.IlIIl = ilIlIlIII;
        this.lIIIIl = this.lIlllI(new Interface());
        this.IIIIlII = this.lIlllI(new Friends());
        this.lIIII = this.lIlllI(new AntiBot());
        this.IIIlIII = this.lIlllI(new AutoPlay());
        this.lIIlII = this.lIlllI(new Panic(this));
        this.llIll = this.lIlllI(new UnloadOrchard(this));
        this.IlIII = this.lIlllI(new Teams());
        this.IIIll = this.lIlllI(new PingSpoof(ilIlIlIII));
        this.IIIIIl = this.lIlllI(new rIZdmx5SQj6YHA(ilIlIlIII));
        this.IIIIlll = this.lIlllI(new Autoclicker());
        this.lI = this.lIlllI(new AimAssist(ilIlIlIII));
        this.IIl = this.lIlllI(new AimOptimizer());
        this.lIl = this.lIlllI(new KillAura());
        this.IlIllI = this.lIlllI(new SprintReset2());
        this.IIIlII = this.lIlllI(new KeepSprint());
        this.IIlIII = this.lIlllI(new MoveFix());
        this.lIlIll = this.lIlllI(new JumpReset());
        this.llll = this.lIlllI(new AutoTotem());
        this.llIlIl = this.lIlllI(new AutoInventoryTotem());
        this.IIIlIl = this.lIlllI(new SpearLunge());
        this.lllIIl = this.lIlllI(new AutoMace());
        this.IIIl = this.lIlllI(new MaceSwap());
        this.llllIl = this.lIlllI(new BreachSwap());
        this.IlII = this.lIlllI(new ShieldBreaker());
        this.llllll = this.lIlllI(new FastAnchor());
        this.IIIIll = this.lIlllI(new AirAnchor());
        this.IllllI = this.lIlllI(new AutoSafeAnchor());
        this.IllIlI = this.lIlllI(new FastCart());
        this.IIIIlIl = null;
        this.llIllI = this.lIlllI(new AutoHeadWeb());
        this.IIlIlI = this.lIlllI(new HitWeb());
        this.IIIIIlI = this.lIlllI(new AutoCart());
        this.lIIllI = this.lIlllI(new CartProtection());
        this.lIlIl = this.lIlllI(new BowSpam());
        this.IIII = this.lIlllI(new KeyXbow());
        this.Illlll = this.lIlllI(new AutoDhand());
        this.lIIIl = this.lIlllI(new ClickCrystal());
        this.IlIlll = this.lIlllI(new AutoCrystal());
        this.ll = this.lIlllI(new AutoHitCrystal());
        this.llIIIl = this.lIlllI(new lIlIIlII());
        this.lllll = this.lIlllI(new lIlIIlII(true));
        this.IlIlII = this.lIlllI(new PotAssist(ilIlIlIII));
        this.IlIIIl = this.lIlllI(new FastXP());
        this.IlIll = this.lIlllI(new NoMissDelay());
        this.IllII = this.lIlllI(new lll());
        this.llIII = this.lIlllI(new Animations());
        this.lIlI = this.lIlllI(new PearlChase());
        this.IIIlll = this.lIlllI(new Sprint());
        this.II = this.lIlllI(new PlayerHider());
        this.lIIIll = this.lIlllI(new NickSwitcher());
        this.IlIlI = this.lIlllI(new Cosmetics());
        this.IIllll = this.lIlllI(new FakeClient());
        this.IIIIlI = this.lIlllI(new Opsec());
        this.IIIIl = this.lIlllI(new XCarry());
        this.llIlII = this.lIlllI(new AutoReconnect());
        this.llIlI = this.lIlllI(new FastPlace());
        this.IIIII = this.lIlllI(new IIIl());
        this.lIIIlI = this.lIlllI(new IIIIIIll());
        this.I = this.lIlllI(new IIIIll());
        this.llllII = this.lIlllI(new IIlllIll());
        this.IllIll = this.lIlllI(new AutoArmor());
        this.lIllIl = this.lIlllI(new InventoryCleaner());
        this.IlIIII = this.lIlllI(new ChestStealer());
        this.Il = this.lIlllI(new AutoDeposit());
        this.IllIII = this.lIlllI(new Trajectories());
        this.IIllII = this.lIlllI(new PopVisuals());
        this.llIIll = this.lIlllI(new PlayerLocator());
        this.lllIl = this.lIlllI(new M2DESP());
        this.IllIIl = this.lIlllI(new Nametags());
        this.IIlllI = this.lIlllI(new TargetHUD(ilIlIlIII, this.lIIIIl));
        this.lII = this.lIlllI(new Chinahat());
        this.IIlll = this.lIlllI(new KeybindsHUD(() -> this.lIIlll, this.lIIIIl));
        this.lIllI = this.lIlllI(new FPS());
        this.IIll = this.lIlllI(new BPS());
        this.IIIlIIl = this.lIlllI(new Radar());
        this.IIlIll = this.lIlllI(new Inventory());
        this.IlllIl = this.lIlllI(new Spotify(this.lIIIIl));
        this.lIIlI = this.lIlllI(new Promo());
        this.lIlllI = this.lIlllI(new Notifications(ilIlIlIII));
        this.lllIII = this.lIlllI(new ModuleList(() -> this.lIIlll, this.lIIIIl));
        this.IIllI = this.lIlllI(new Watermark(this.lIIIIl));
        this.lIlIII = this.lIlllI(new NoPush());
        this.lIIlIl = this.lIlllI(new Speed());
        this.lllIlI = this.lIlllI(new CollisionSpeed());
        this.llIIII = this.lIlllI(new NoJumpDelay());
        this.Illll = this.lIlllI(new AutoWalk());
        this.IIIIllI = this.lIlllI(new Parkour());
        this.llIIl = this.lIlllI(new PerfectWindcharge());
        this.lllII = this.lIlllI(new AutoTool());
        this.IlIl = this.lIlllI(new FakePlayer());
        this.IllI = this.lIlllI(new SnapTap());
        this.lIllII = this.lIlllI(new LegitScaffold());
        this.lIIIII = this.lIlllI(new AutoGG(ilIlIlIII));
        this.IIlIl = this.lIlllI(new StrayUtils());
        this.lllllI = this.lIlllI(new FakeHacker());
        this.lIlII = this.lIlllI(new RangeFinder());
        this.lIll = this.lIlllI(new TargetCircle(ilIlIlIII));
        this.lIlIIl = this.lIlllI(new Rotations());
        this.Illl = this.lIlllI(new JumpCircle());
        this.IIllIl = this.lIlllI(new DivebombESP());
        this.lIIl = this.lIlllI(new Glow());
        this.IlIlIl = this.lIlllI(new NoBounce());
        this.llI = this.lIlllI(new FullBright());
        this.lll = null;
        this.IlI = this.lIlllI(new HitMarker());
        this.IIIIIll = this.lIlllI(new Freecam());
        this.lllI = this.lIlllI(new StorageESP());
        this.IIlI = this.lIlllI(new VClip());
        this.IIlII = this.lIlllI(new NoEffectView());
        this.lIIll = this.lIlllI(new Effects());
        this.IIIllI = this.lIlllI(new ItemESP());
        this.IllIl = this.lIlllI(new AutoDrain());
        this.llII = null;
        this.Ill = this.lIlllI(new Backtrack());
        this.IIIIIIl = this.lIlllI(new PlayerFreeze());
        this.IIIlI = this.lIlllI(new StreamerMode());
        this.IlllI = this.lIlllI(new Extinguish());
        this.l = this.lIlllI(new HoverTotem());
        this.llIl = this.lIlllI(new ClickSimulations());
        this.llllI = this.lIlllI(new VisualSwitch());
        this.lIII = this.lIlllI(new ElytraSwap());
        this.IlllII = this.lIlllI(new NoInteract());
        this.llIlll = this.lIlllI(new StashFinder());
    }

    public Friends IIllIII() {
        return this.IIIIlII;
    }

    public KnockbackDisplacement IIllIIl() {
        return this.llII;
    }

    public NoMissDelay IIllIlI() {
        return this.IlIll;
    }

    public ClickCrystal IIllIll() {
        return this.lIIIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIlllII(Packet<?> packet) {
        ModuleBase moduleBase;
        if (!(packet instanceof PlayerInteractEntityC2SPacket)) {
            return false;
        }
        Iterator<ModuleBase> iterator = this.llIIlI.iterator();
        do {
            if (!iterator.hasNext()) return false;
            moduleBase = iterator.next();
            if (moduleBase.IIIlIIl()) return true;
        } while (moduleBase.lllllI());
        return true;
    }

    public PingSpoof IIlllIl() {
        return this.IIIll;
    }

    public KeepSprint IIllllI() {
        return this.IIIlII;
    }

    public SnapTap IIlllll() {
        return this.IllI;
    }

    public rIZdmx5SQj6YHA IlIIIII() {
        return this.IIIIIl;
    }

    public MaceSwap IlIIIIl() {
        return this.IIIl;
    }

    public VClip IlIIIlI() {
        return this.IIlI;
    }

    public InventoryCleaner IlIIIll() {
        return this.lIllIl;
    }

    /*
     * Unable to fully structure code
     */
    public void IlIIlII(MinecraftClient var1_1) {
        block18: {
            block21: {
                block13: {
                    block16: {
                        block19: {
                            block22: {
                                block17: {
                                    block20: {
                                        block15: {
                                            block14: {
                                                if (var1_1 == null) break block16;
                                                break block20;
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    var5_4.llllIl();
                                                    ** GOTO lbl10
                                                    break;
                                                }
lbl6:
                                                // 1 sources

                                                while (!this.lIIIl(var6_5)) {
                                                    break block13;
lbl8:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var7_6) break block14;
lbl10:
                                                        // 4 sources

                                                        while (true) {
                                                            this.IIIIII.put(var5_4, var7_6);
                                                            break block15;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                break block21;
lbl15:
                                                // 1 sources

                                                while (var1_1.currentScreen != null) {
                                                    break block16;
                                                }
                                                break block22;
                                            }
                                            if (var8_7) ** GOTO lbl10
                                            ** while (true)
                                        }
lbl22:
                                        // 4 sources

                                        while (true) {
                                            if (!var4_3.hasNext()) break block17;
                                            break block18;
                                            break;
                                        }
lbl25:
                                        // 1 sources

                                        while (true) {
                                            v0 = true;
                                            break block19;
lbl28:
                                            // 1 sources

                                            while (true) {
                                                if (!var5_4.IlIIIIl()) ** break;
                                                ** continue;
                                                ** continue;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    if (var1_1.getWindow() == null) break block16;
                                    ** GOTO lbl15
                                    while (true) {
                                        var6_5 = var5_4.IIIllII();
                                        ** GOTO lbl6
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var8_7 = this.IIIIII.getOrDefault(var5_4, false);
                                        ** continue;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        if (var5_4.IIIIIII()) ** continue;
                                        ** GOTO lbl22
                                        break;
                                    }
                                }
                                return;
lbl46:
                                // 1 sources

                                while (true) {
                                    if (!var5_4.lllllI()) ** GOTO lbl22
                                    ** continue;
                                    break;
                                }
                            }
                            var2_2 = var1_1.getWindow().getHandle();
                            var4_3 = this.lIllll.iterator();
                            ** while (true)
                        }
lbl54:
                        // 2 sources

                        while (true) {
                            var7_6 = v0;
                            ** continue;
                            break;
                        }
                    }
                    return;
                }
                ** while (lIIllllI.llI((MinecraftClient)var1_1, (InputUtil.Key)var6_5))
            }
            v0 = false;
            ** while (true)
        }
        var5_4 = var4_3.next();
        ** while (true)
    }

    public Watermark IlIIlIl() {
        return this.IIllI;
    }

    public Trajectories IlIIllI() {
        return this.IllIII;
    }

    public void IlIIlll(String string) {
        this.IIlIIlI(this.IIlIl, 60, () -> this.IIlIl.IlI(string));
    }

    public PopVisuals IlIlIII() {
        return this.IIllII;
    }

    private static /* synthetic */ void IlIlIIl(ModuleBase moduleBase, Packet packet) {
        moduleBase.IIIIllI(packet);
    }

    public FakePlayer IlIlIlI() {
        return this.IlIl;
    }

    private /* synthetic */ void IlIlIll(DrawContext drawContext, int n, int n2, float f) {
        this.lIlllI.Il(drawContext, n, n2, f);
    }

    public CollisionSpeed IlIllII() {
        return this.lllIlI;
    }

    private static int IlIllIl(int n, int n2) {
        return IIIlIlI[n ^ 0x72275C97] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 32766;
        var7_2 = "\u9b77\u9b7c\u9b6c\u9b07\u9b61\u9b0f\u9b54\u9bef\u9b6b\u9beb\u9b88\u9b18\u9b04\u9b7f\u9bb1\u9b31\u9bf2\u9bff\u9b4d\u9b70\ufc7a\ufc71\ufc61\ufc0a\ufc6c\ufc02\ufc59\ufce2\ufc66\ufce6\ufc85\ufc15\ufc09\ufc72\ufcbc\ufc3c\ufcff\ufcf2\ufc40\ufc7d\udb98\udbcc\udb9c\udbf4\udbd0\udbf9\udbd3\udb71\u3487\u348b\u34ae\u348c\u3495\u34c0\u34a4\u341f\u3484\u341c\u3428\u34fd\u34e1\u34b1\u342e\u34cc\u341a\u343d\u34b9\u3484\u0d35\u0d39\u0d1c\u0d3e\u0d27\u0d72\u0d0e\u0da7\u0d37\u0dad\u0d87\u0d45\u0d42\u0d3d\u0d90\u0d27\ue462\ue406\ue47e\ue462\ue42d\ue432\ue47b\ue493\u7293\u72fa\u728e\u729a\u72c3\u72f4\u7298\u7204\u7280\u7202\u725f\u72ef\u72ed\u72bf\u7265\u72f7\u7204\u722c\u72b9\u72ce\u722c\u72bc\u72fb\u7217\u7203\u720c\u72d2\u7292\u725d\u7206\u72b1\u7224\u72a0\u72d1\u72b3\u72a7\uef58\uef31\uef45\uef51\uef08\uef3f\uef53\uefcf\uef4b\uefe3\uefb6\uef24\uef20\uef67\uefef\uef22\uefcf\uefcc\uef02\uef31\ueffa\uef4c\uef3c\uefec\uefc4\uefca\uef4e\uef0c\uef9d\uef8b\uef02\uefb4\uf52c\uf528\uf524\uf50e\u3543\u3557\u354b\u3561\u1670\u1674\u1678\u1652\ubaa3\ubac8\ubab4\uba9b\u6a16\u6a45\u6a26\u6a32\u6a5c\u6a6e\u6a1e\u6a8c\ua53a\ua569\ua50a\ua51e\ua570\ua542\ua532\ua5a0\ua53e\ua581\ua59b\ua521\ufc16\ufc4d\ufc41\ufc6b\uccea\ucce0\uccf7\uccc8\ucca3\uccab\uccc7\ucc76\ua142\ua148\ua161\ua155\u1237\u1245\u1200\u1212\u127a\u1272\u121e\u129c\u1233\u12ad\u1291\u122b\u979f\u97ed\u97a8\u97ba\u97d2\u97da\u97b6\u9734\u979b\u9705\u973c\u9783\u7474\u743b\u742c\u7456\u743d\u741c\u7426\u7484\u332c\u334e\u3332\u333f\u3363\u3350\u3320\u33b2\uc880\uc8f2\uc89a\uc890\uc8ce\uc8d6\uc8be\uc819\uaecf\uaec5\uaefd\uaed5\uae86\uaea5\uaec9\uae45\uaece\uae40\uae6c\uaed6\u172b\u1763\u1774\u1728\u1765\u1757\u1716\u17dc\uf10f\uf17c\uf126\uf113\uf147\uf161\uf15b\uf1f9\u45ae\u45a4\u45b3\u45b7\u45e1\u45d5\u45a9\u4539\u45ae\u4520\u4509\u45b6\u853e\u854d\u8517\u8522\u8576\u8550\u856a\u85c8\u47ec\u4794\u47be\u4794\uf45d\uf457\uf440\uf444\uf412\uf426\uf45a\uf4ca\uf45d\uf4d3\uf4fa\uf445\u4114\u411e\u410b\u4112\u415c\u4147\u413f\u418c\u4111\u41b1\u41e0\u4142\u4166\u413e\u41b5\u4102\u53ec\u5392\u53d7\u53e1\u53bc\u538f\u53cd\u536e\u53f7\u5353\u5328\u5382\u5384\u53d7\u5312\u538a\u537f\u536d\u53c6\u53aa\u5357\u53d7\u539c\u5342\u5366\u533b\u53e5\u5387\u5324\u537d\u53da\u5368\u53dd\u53db\u53ae\u53f6\u53dd\u53a2\u53c1\u537a\u53f7\u5346\u534d\u5383\u5390\u53ef\u5359\u53bb\u5333\u5358\u53b5\u53b9\u530a\u53ce\u53da\u5344\u533e\u5339\u5389\u53bf\u5304\u532f\u53d1\u537c\u53aa\u5386\u53dd\u53f5\u53da\u53bf\u53b3\u5366\u53ca\u5359\u5369\u53a5\u53d9\u53f9\u5303\u53ab\u530d\u530b\u5389\u5387\u537b\u53f7\u53f3\u5349\u533e\u5338\u53d9\u53a5\u5358\u535a\u53f4\u536a\u53f2\u53fa\u53ff\u53e3\u5397\u5388\u53d3\u536f\u53d8\u5371\u530e\u53b5\u53ba\u53f1\u532e\u53be\u536c\u534f\u53ab\u5399\u537b\u53d4\u5396\u536b\u534f\u5323\u53cc\u539e\u5304\u5328\u53fa\u537a\u53d9\u53a1\u53cb\u53d8\u53f2\u539f\u53d4\u5341\u5381\u535e\u536b\u5381\u53b9\u53e7\u5362\u53b2\u5324\u532b\u5392\u53bd\u5335\u53e0\u53cb\u536c\u535b\u531f\u53af\u539d\u5371\u533c\u53d4\u5348\u53bc\u53a4\u53c4\u53db\u53e5\u53ab\u5380\u535d\u53bd\u532e\u537d\u53b3\u53f4\u53ab\u5311\u53b6\u5311\u537b\u53ce\u539e\u5357\u53e7\u53f1\u5363\u5300\u5379\u53c6\u53ab\u532a\u5318\u53a5\u5371\u53f5\u53ff\u53c7\u53f6\u53a7\u53b1\u53f0\u5375\u53fa\u5353\u5359\u53b0\u5393\u53fe\u532f\u538b\u536a\u532c\u53c2\u5396\u5355\u53a8\u53ad\u5353\u5364\u5301\u53d4\u5392\u532b\u531a\u53f8\u536d\u53d9\u538c\u538d\u53ad\u623b\u6249\u6221\u622b\u6275\u626d\u6205\u62a2\u3f1c\u3f65\u3f4f\u3f65\ud891\ud89b\ud88e\ud897\ud8d9\ud8c2\ud8ba\ud809\ud894\ud834\ud865\ud8c7\ud8e3\ud8bb\ud830\ud887\u3a99\u3a9d\u3a91\u3abb\udd56\udd24\udd4c\udd46\udd18\udd00\udd68\uddcf\u86ed\u86c0\u86b3\u86ab\u86fd\u86e3\u86ec\u863c\u86bc\u863f\u8643\u86dd\u69b6\u69bc\u69a9\u69b0\u69fe\u69e5\u699d\u692e\u69b3\u6913\u6942\u69e0\u69c4\u699c\u6917\u69a0\u3ec4\u3ebe\u3ec2\u3efe\u3e94\u3e9a\u3eee\u3e57\u3ed5\u3e78\u3e3d\u3e9f\u3eba\u3e87\u3e31\u3ebf\u3e50\u3e0f\u3ebf\u3ea6\u3e20\u3ed5\u3ef7\u3e18\u4de4\u4dee\u4dfb\u4de2\u4dac\u4db7\u4dcf\u4d7c\u4de1\u4d41\u4d10\u4db2\u4d96\u4dce\u4d45\u4df2\ue2a8\ue2d6\ue2aa\ue2a6\ue2f9\ue2f2\ue28a\ue22d\ue2b3\ue23a\ue25b\ue2ab\u06c5\u06ab\u0686\u06d5\u0694\u06a5\u06c5\u0671\u06de\u0643\u062b\u06a3\u7731\u777e\u7769\u7713\u7778\u7759\u7763\u77c1\u27ce\u2796\u279a\u27b0\u6637\u6643\u666e\u663d\u667b\u665e\u6664\u66c6\u1dcd\u1de4\u1db9\u1db3\u1d85\u1dfa\u1dc0\u1d62\uedfd\uedf7\uede2\uedfb\uedb5\uedae\uedd6\ued65\uedf8\ued58\ued09\uedab\ued8f\uedd7\ued5c\uedeb\udee0\udeb6\udee4\udedb\udeb0\ude81\udeab\ude09\u286b\u2846\u280f\u2849\ud425\ud42f\ud43a\ud423\ud46d\ud476\ud40e\ud4bd\ud420\ud480\ud4d1\ud473\ud457\ud40f\ud484\ud433\u5de2\u5d98\u5de4\u5dd8\u5db2\u5dbc\u5dc8\u5d71\u5df3\u5d5e\u5d1b\u5db9\u5d9c\u5da1\u5d17\u5d99\u5d76\u5d29\u5d99\u5d80\u5d06\u5df3\u5dd1\u5d3e\ucf38\ucf32\ucf27\ucf3e\ucf70\ucf6b\ucf13\ucfa0\ucf3d\ucf9d\ucfcc\ucf6e\ucf4a\ucf12\ucf99\ucf2e\ud598\ud5b1\ud5ec\ud5e6\ud5d0\ud5af\ud595\ud537\u3847\u384d\u3858\u3841\u380f\u3814\u386c\u38df\u3842\u38e2\u38b3\u3811\u3835\u386d\u38e6\u3851\ud152\ud105\ud157\ud14b\ud105\ud10b\ud115\ud1df\u2861\u2848\u2815\u281f\u2829\u2856\u286c\u28ce\u4910\u4972\u490e\u4903\u495f\u496c\u491c\u498e\u3a44\u3a4e\u3a5b\u3a42\u3a0c\u3a17\u3a6f\u3adc\u3a41\u3ae1\u3ab0\u3a12\u3a36\u3a6e\u3ae5\u3a52\u9cd0\u9cd4\u9cd8\u9cf2\u9d7d\u9d1f\u9d63\u9d6e\u9d32\u9d01\u9d71\u9de3\u02f7\u02da\u02a9\u02b1\u02e7\u02f9\u02f6\u0226\u02a6\u0225\u0259\u02c7\u5284\u528e\u529b\u5282\u52cc\u52d7\u52af\u521c\u5281\u5221\u5270\u52d2\u52f6\u52ae\u5225\u5292\uebcb\uebb1\uebcd\uebf1\ueb9b\ueb95\uebe1\ueb58\uebda\ueb77\ueb32\ueb90\uebb5\ueb88\ueb3e\uebb0\ueb5f\ueb00\uebb0\ueba9\ueb2f\uebda\uebf8\ueb17\u114b\u1141\u1154\u114d\u1103\u1118\u1160\u11d3\u114e\u11ee\u11bf\u111d\u1139\u1161\u11ea\u115d\u233d\u2347\u233b\u2336\u236d\u237c\u2335\u23b5\u2322\u23ab\u23ca\u233a\u9315\u931f\u9308\u9337\u935c\u9354\u9338\u9389\ub307\ub30d\ub324\ub310\u2f5c\u2f2e\u2f6b\u2f79\u2f11\u2f19\u2f75\u2ff7\u2f58\u2fc6\u2ffa\u2f40\u1b9c\u1bee\u1bab\u1bb9\u1bd1\u1bd9\u1bb5\u1b37\u1b98\u1b06\u1b3f\u1b80\u33ac\u33d8\u33f5\u33a6\u33e0\u33c5\u33ff\u335d\u5465\u546f\u547a\u5463\u542d\u5436\u544e\u54fd\u5460\u54c0\u5491\u5433\u5417\u544f\u54c4\u5473\ud461\ud473\ud464\ud45b\ud430\ud438\ud454\ud4e5\ud47e\ud486\ud484\ud404\u78f7\u78a1\u78f3\u78cc\u78a7\u7896\u78bc\u781e\u4771\u475c\u4715\u4753\u7012\u7018\u700d\u7014\u705a\u7041\u7039\u708a\u7017\u70b7\u70e6\u7044\u7060\u7038\u70b3\u7004\u4189\u418d\u4181\u41ab\u5a08\u5a29\u5a03\u5a29\u4a4f\u4a62\u4a11\u4a32\u4a5a\u4a6b\u4a2d\u4a8e\u4a02\u4ab8\u4ab2\u4a08\u03d2\u03a6\u03ce\u03c6\u039a\u03bb\u0381\u0323\u4bf2\u4bf8\u4bed\u4bf4\u4bba\u4ba1\u4bd9\u4b6a\u4bf7\u4b57\u4b06\u4ba4\u4b80\u4bd8\u4b53\u4be4\u7b00\u7b12\u7b05\u7b3a\u7b51\u7b59\u7b35\u7b84\u7b0b\u7b95\u7bc4\u7b64\u7b78\u7b2b\u7bf2\u7b52\u7b91\u7bc1\u7b70\u7b45\u1144\u1110\u1160\u1178\u1110\u1134\u1148\u11c6\u114c\u11d1\u11a9\u1123\u112f\u117c\u118f\u1121\u11d1\u11c6\u113f\u1102\u11f9\u116c\u112b\u11c0\u11dc\u1194\u1163\u1111\u1193\u11b5\u1165\u11af\u6c59\u6c57\u6c62\u6c5d\u6c14\u6c25\u6c0f\u6cad\u4ad5\u4adf\u4aca\u4ad3\u4a9d\u4a86\u4afe\u4a4d\u4ad0\u4a70\u4a21\u4a83\u4aa7\u4aff\u4a74\u4ac3\u9ff2\u9fe0\u9ff7\u9fc8\u9fa3\u9fab\u9fc7\u9f76\u9ff9\u9f64\u9f5e\u9f98\u9f81\u9ff3\u9f04\u9fa7\u9f76\u9f5d\u9fa2\u9fef\u2444\u2410\u2460\u2478\u2410\u2434\u2448\u24c6\u244c\u24d1\u24a9\u2423\u242f\u247f\u24b9\u242f\u24d2\u24d6\u243b\u2402\u24f9\u246c\u242b\u24c0\u24dc\u2494\u2463\u2411\u2493\u24b5\u2465\u24af\uf4e5\uf493\uf4c9\uf4fc\uf4af\uf49e\uf4b8\uf478\ud46c\ud41a\ud440\ud475\udba3\udbe8\udb88\udbbe\udbe8\udbf9\udbf1\udb39\ueb17\ueb1d\ueb08\ueb11\ueb5f\ueb44\ueb3c\ueb8f\ueb12\uebb2\uebe3\ueb41\ueb65\ueb3d\uebb6\ueb01\u7555\u7547\u7550\u756f\u7504\u750c\u7560\u75d1\u755e\u75c0\u75bb\u753b\u752c\u756e\u75a3\u752a\u75c4\u75d4\u752d\u7530\u75b6\u7543\u7561\u758e\ubb15\ubb41\ubb31\ubb29\ubb41\ubb65\ubb19\ubb97\ubb1d\ubb80\ubbf8\ubb72\ubb7e\ubb2d\ubbe4\ubb44\ubb85\ubbda\ubb69\ubb7d\ubbab\ubb5e\ubb76\ubba8\ubb8f\ubb80\ubb2e\ubb43\ubbde\ubbda\ubb11\ubb84\ubb7e\ubb66\ubb3d\ubb57\u57cb\u57ae\u57d9\u57ce\u5787\u5796\u57d3\u5741\uca1f\uca15\uca00\uca19\uca57\uca4c\uca34\uca87\uca1a\ucaba\ucaeb\uca49\uca6d\uca35\ucabe\uca09\u558d\u559f\u5588\u55b7\u55dc\u55d4\u55b8\u5509\u5586\u5518\u5567\u55e0\u55f1\u55b6\u5549\u55f0\u5518\u5541\u55f2\u55cc\u5525\u55b2\u55e3\u5556\u2129\u217d\u210d\u2115\u217d\u2159\u2125\u21ab\u2121\u21bc\u21c4\u214e\u2142\u2111\u21dc\u2159\u21b0\u21e6\u214d\u2147\u2193\u212f\u214a\u2194\u21b3\u21bc\u2112\u217f\u21e2\u21e6\u212d\u21b8\u2142\u215a\u2101\u216b\u3c15\u3c1d\u3c39\u3c31\ub357\ub333\ub379\ub374\ub31b\ub32e\ub304\ub3a6\u638f\u6385\u63bd\u6395\u63c6\u63e5\u6389\u6305\u638e\u6300\u632c\u6396\u9d7e\u9d36\u9d21\u9d7d\u9d30\u9d02\u9d43\u9d89\uc6dc\uc6ad\uc6e7\uc6fa\uc690\uc6a3\uc6d8\uc628\u56ee\u568c\u56f0\u56f3\u56a6\u56b8\u56ee\u5670\u38c2\u38cc\u38e9\u38dc\u388f\u3887\u3898\u3858\u38c1\u387e\u3830\u38a5\u38ad\u38f5\u3820\u38a1\u9be0\u9bea\u9bff\u9be6\u9ba8\u9bb3\u9bcb\u9b78\u9be5\u9b45\u9b14\u9bb6\u9b92\u9bca\u9b41\u9bf6\u4c83\u4cf9\u4c85\u4cb9\u4cd3\u4cdd\u4ca9\u4c10\u4c92\u4c3f\u4c7a\u4cec\u4cfd\u4cc0\u4c48\u4ce0\u4c12\u4c05\u4caa\u4cc5\u4c64\u4cbb\u4ce4\u4c05\u4c1e\u4c7e\u4c82\u4cd4\u4c52\u4c5c\u4cd3\u4c04\u4cb6\u4ce4\u4cc1\u4ca8\u4cb4\u4ce3\u4cb1\u4c12\u4cd7\u4c3a\u4c7e\u4ce4\u4ca2\u4c93\u4c0c\u4cc4\u4c5e\u4c1d\u4cf8\u4cd5\u4c76\u4ce7\u4c80\u4c2c\u4c08\u4c41\u4ccb\u4cd3\u4c6c\u4c57\u4ce0\u4c20\u4cd4\u4ced\u4cba\u4c9e\u344b\u3440\u3453\u3462\u3400\u3431\u3455\u34e4\u344a\u34d4\u34bc\u3404\u342d\u3479\u3492\u3407\u34d0\u34d4\u342d\u3410\u34eb\u3416\u3469\u34e5\udfaf\udfa4\udfb7\udf86\udfe4\udfd5\udfb1\udf00\udfae\udf30\udf58\udfe0\udfc9\udf9d\udf76\udfe3\udf34\udf7b\udfe3\udff4\ufb18\ufb13\ufb00\ufb31\ufb53\ufb62\ufb06\ufbb7\ufb19\ufb87\ufbef\ufb57\ufb7e\ufb2a\ufbc1\ufb7e\u2edf\u2e89\u2edb\u2ee4\u2e8f\u2ebe\u2e94\u2e36\u11ac\u11f8\u11a8\u11c0\u11e4\u11cd\u11e7\u1145\u417b\u4171\u417a\u416a\u4131\u4103\u4167\u418b\u7ff0\u7f94\u7fec\u7ff0\u7fbf\u7fa0\u7fe9\u7f01\uf3fc\uf393\uf3a9\uf383\uca26\uca48\uca13\uca45\u7867\u7803\u783e\u7874\u782f\u780d\u785f\u78f8\u80b1\u80c5\u809f\u80a0\u80fd\u80d8\u80e2\u8040\ud43c\ud477\ud460\ud42f\ud470\ud450\ud467\ud4c8\u6f45\u6f49\u6f6c\u6f4e\u6f57\u6f02\u6f66\u6fdd\u6f46\u6fde\u6fea\u6f3f\u6f23\u6f73\u6fec\u6f0e\u6fd8\u6fff\u6f7b\u6f46";
        var8_3 = "\u7fea\u7fea\u7ff6\u7fea\u7fee\u7ff6\u7fda\u7fde\u7ffa\u7ffa\u7ffa\u7ffa\u7ff6\u7ff2\u7ffa\u7ff6\u7ffa\u7ff2\u7ff2\u7ff6\u7ff6\u7ff6\u7ff2\u7ff6\u7ff6\u7ff2\u7ff6\u7ffa\u7ff2\u7fee\u7f1a\u7ff6\u7ffa\u7fee\u7ffa\u7ff6\u7ff2\u7fee\u7fe6\u7fee\u7ff2\u7ff2\u7ff6\u7ffa\u7ff6\u7ff6\u7fee\u7ff6\u7ffa\u7fee\u7fe6\u7fee\u7ff6\u7fee\u7ff6\u7ff6\u7ff6\u7fee\u7ffa\u7ff6\u7ff2\u7fee\u7fe6\u7fee\u7ff2\u7ff6\u7ffa\u7ff2\u7ff2\u7ff6\u7fee\u7ff2\u7ff6\u7ffa\u7fee\u7ffa\u7ffa\u7ff2\u7ff6\u7fee\u7fea\u7fde\u7ff6\u7fee\u7fea\u7fde\u7ff6\u7ffa\u7ff6\u7fee\u7fe6\u7fda\u7ff6\u7fee\u7fe6\u7fda\u7ffa\u7ff6\u7ff2\u7ff6\u7ff6\u7ff6\u7fee\u7fee\u7fba\u7fe6\u7fea\u7fee\u7ff6\u7ff6\u7ff6\u7ff6\u7ffa\u7ffa\u7ff6\u7ff6\u7ff6\u7fea".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl52
        while (true) {
            block12: {
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl29
                while (true) {
                    lllIIlI.IIIlIll = var9_4;
                    lllIIlI.IIIllII = new Object[var9_4.length];
                    var2_13 = -1232091436;
                    var0_11 = "K\u00d0\u0005[\u00fb\u00fd(0%\u008d\f\u00b9\u00eb\u001bG@\u00c6O.p4\u00ef\u0087\u00f3\u00b9\u0018\u001b<c\u00b6\u00e4\u00a68(\u009fB\u009f\u0013\u00c2\u00114\u009c\u00bb>\u0014\u0092\u00a6$X2\u0007(\u0092\u0016\u001c1\u001e\u009d\u00a1\u00f7zgj\r\u00a1\"\u00e5;A|\u00d3\u00bfh\u00b4\u00d6tC\u00f9X\u00bfbU/lH\u00a0\u0007\u0080\u00fb\u00c6\u00fb\f>\u00cb*q\u00c6\u00da\u00bfOhP\u00bf6\u0089\u00fc\u00dcJ\u00b3\u00be\u009a\u0086\u0098\u0086b\"-\u00144\u009bw\u008a\u00fb\u0099_\u00f1H\u00a8^1\u00ea\u00ae\r\u0019;\u00de\u0001\u00b3\u000bJ\u001c\u00de\u00cd\u008aQ\u001e\u008c\u0084\fC\u0007?n\u00ba\u00b6\u00f2\u00f1\u00a7m\u0019c\u00f1+\u001f\u009bLDC&*K@\u009f<Pj\u00bb\bW\u00e9\u0095*u\u0087\u00f59o2o\u0004\u0012\u00aeM\u0080\"\u0005\u00c3>\u00f1a\u00d8v\u00a9\u00ec\u00cf\u00f2[$&\u0081L\u00b4V\u0013\"\u009f\u0001\bLe\u00aa\u0083,Aq\u00d7\u00e0F\u0002\u00a1\u009e]*\u00fc\u001b\u0091\u00ec\u00b4\u00ed\u00b3f#8\u00ad*\u00a2$\u00c7\u008f7^v \u00fb\u0015k\u0006\u00db\u0096(\u000e\u00aet@0]\u00acp\u00f3\u0091c*\u00efs\u00c1\u0013\n\u008d\u00c1\u008b\u00b8'\u00bd\u00a9\u008a\u009e\u0004\u00c9|\u00d9\u00eb9\u0099\u00faw\u008b\u0092\u00b1W\u00bf\u00e1q\u000b\u0092\u00e2@O\u00ec\u00ce\u00aa\u00ff\rf`\u0019M\u00a7\u00e5ur\u00f0\u00e4ci\u0016qgS\u0098\u00c2\u00da\u001c\u009a\u0014\u00af\u00e9=\u0080FK\u00e5\u00f2\u0087j\u00bax\u0094\u00f5\u00b1\u00aaNu\bPZ\u0014\u00aa8\u00faJ\fx\nn6\u00c1\u00d8@\u0094>:\u00876\u00fe\u001737\u0010!/;\u00e8\u00c8\u0002)oi\u00a5\u00b5\u00c3\u00b6d\u0005N\u00bas\u0092\u0094\u00e3\u00b7\u000e\u00a7p\u00de^\u00d1\u0099j\u00e1b\u008a%\u00ed\u00f1o\u00a8\u00bb\u0081[\u00be\u0006\u00dd\u0007\u009c\u00a0\u00191\u00de\u00b9\u000b\u00f79 \u0080c\b\u00dd\u007f\u00c0\u00ef\u00a3\u00fe?\u0099}{\u00a6\u00f9\u00ce\u00cfL\u00911\u00da|\u00ab\u00adgtH\u0003\u000f+\u00f27\u00a3}\u00c8\t\u008f\u00eb[".getBytes("ISO-8859-1");
                    var1_12 = var0_11.length / 4;
                    lllIIlI.IIIlIlI = new int[var1_12];
                    var3_14 = 0;
                    var4_15 = 0;
                    if (true) ** GOTO lbl64
                    break;
                }
                block9: while (true) {
                    block13: {
                        v0 = var15_10++;
                        var14_9[v0] = (char)(var14_9[v0] ^ var16_1);
                        if (var15_10 < var14_9.length) break block13;
                        var9_4[var10_5] = new String(var14_9).intern();
                        var11_6 += var12_7;
                        if (++var10_5 < var8_3.length) break block12;
                        ** GOTO lbl43
                    }
                    switch (var15_10 % 6) {
                        case 5: {
                            v1 = 64;
                            break;
                        }
                        default: {
                            v1 = 86;
                            break;
                        }
                        case 3: {
                            v1 = 103;
                            break;
                        }
                        case 1: {
                            v1 = 71;
                            break;
                        }
lbl43:
                        // 1 sources

                        var13_8 = 0;
                        break block9;
                        case 4: {
                            v1 = 29;
                            break;
                        }
                        case 2: {
                            v1 = 122;
                        }
                    }
                    var16_1 = v1;
                }
lbl52:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 == 0) ** continue;
            }
            var12_7 = var8_3[var10_5] ^ var6;
        }
        while (true) {
            lllIIlI.IIIlIlI[var4_15] = var5_16 ^= var2_13;
            var3_14 += 4;
            if (++var4_15 >= var1_12) {
                return;
            }
lbl64:
            // 3 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlIlllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4B402159;
        char[] cArray = IIIlIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIllII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIIlI.IIIllII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1866C8B;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 5: {
                    n6 = 149;
                    continue block33;
                }
                case 20: {
                    n6 = 78;
                    continue block33;
                }
                case 21: {
                    n6 = 242;
                    continue block33;
                }
                case 16: {
                    n6 = 43;
                    continue block33;
                }
                case 1: {
                    n6 = 132;
                    continue block33;
                }
                case 9: {
                    n6 = 84;
                    continue block33;
                }
                case 13: {
                    n6 = 210;
                    continue block33;
                }
                case 29: {
                    n6 = 4;
                    continue block33;
                }
                case 8: {
                    n6 = 208;
                    continue block33;
                }
                case 14: {
                    n6 = 24;
                    continue block33;
                }
                case 27: {
                    n6 = 176;
                    continue block33;
                }
                default: {
                    n6 = 199;
                    continue block33;
                }
                case 7: {
                    n6 = 118;
                    continue block33;
                }
                case 26: {
                    n6 = 239;
                    continue block33;
                }
                case 30: {
                    n6 = 209;
                    continue block33;
                }
                case 4: {
                    n6 = 197;
                    continue block33;
                }
                case 17: {
                    n6 = 81;
                    continue block33;
                }
                case 25: {
                    n6 = 0;
                    continue block33;
                }
                case 10: {
                    n6 = 126;
                    continue block33;
                }
                case 18: {
                    n6 = 175;
                    continue block33;
                }
                case 24: {
                    n6 = 124;
                    continue block33;
                }
                case 19: {
                    n6 = 131;
                    continue block33;
                }
                case 28: {
                    n6 = 105;
                    continue block33;
                }
                case 3: {
                    n6 = 216;
                    continue block33;
                }
                case 15: {
                    n6 = 178;
                    continue block33;
                }
                case 11: {
                    n6 = 153;
                    continue block33;
                }
                case 22: {
                    n6 = 240;
                    continue block33;
                }
                case 2: {
                    n6 = 239;
                    continue block33;
                }
                case 6: {
                    n6 = 197;
                    continue block33;
                }
                case 23: {
                    n6 = 66;
                    continue block33;
                }
                case 31: {
                    n6 = 118;
                    continue block33;
                }
                case 12: 
            }
            n6 = 137;
        }
    }
}

