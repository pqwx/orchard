/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlII
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.util.PlayerInput
 */
package orchard.internal;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.PlayerInput;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class IIIIlII {
    private final Map<KeyBinding, Map<Object, Boolean>> I = new IdentityHashMap<KeyBinding, Map<Object, Boolean>>();
    private static final IIIIlII l = new IIIIlII();
    private final Map<KeyBinding, Boolean> II = new IdentityHashMap<KeyBinding, Boolean>();

    /*
     * Enabled aggressive block sorting
     */
    private void I(KeyBinding keyBinding, boolean bl, boolean bl2) {
        keyBinding.setPressed(bl);
        InputUtil.Key key = lIIllllI.IlllllI(keyBinding);
        if (lIIllllI.IlIIlll(key)) return;
        KeyBinding.setKeyPressed((InputUtil.Key)key, (boolean)bl);
        if (!bl2) return;
        KeyBinding.onKeyPressed((InputUtil.Key)key);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(KeyBinding keyBinding, boolean bl) {
        boolean bl2;
        Map<Object, Boolean> map = this.I.get(keyBinding);
        if (map != null && !map.isEmpty()) {
            bl2 = IIIIlII.Ill(map);
            return bl2;
        }
        bl2 = bl;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void II(Object object, MinecraftClient minecraftClient) {
        if (object == null) {
            return;
        }
        Iterator<KeyBinding> iterator = Set.copyOf(this.I.keySet()).iterator();
        while (iterator.hasNext()) {
            KeyBinding keyBinding = iterator.next();
            this.IIl(object, minecraftClient, keyBinding);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Il(Object object, MinecraftClient minecraftClient, KeyBinding keyBinding2, boolean bl) {
        boolean bl2;
        if (object == null) return;
        if (keyBinding2 != null) {
            if (!IIIIlII.III(minecraftClient)) {
                this.IIl(object, minecraftClient, keyBinding2);
                return;
            }
        } else {
            return;
        }
        Map map = this.I.computeIfAbsent(keyBinding2, keyBinding -> new IdentityHashMap());
        boolean bl3 = bl2 = map.isEmpty() ? lIIllllI.IIllIII(minecraftClient, keyBinding2) : IIIIlII.Ill(map);
        if (map.isEmpty()) {
            this.II.put(keyBinding2, bl2);
        }
        map.put(object, bl);
        boolean bl4 = IIIIlII.Ill(map);
        this.I(keyBinding2, bl4, !bl2 && bl4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void ll(Object object, MinecraftClient minecraftClient, KeyBinding keyBinding) {
        if (object == null) return;
        if (keyBinding == null) return;
        this.IIl(object, minecraftClient, keyBinding);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean III(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (minecraftClient.getWindow() == null) return false;
        if (!minecraftClient.isWindowFocused()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(Object object, MinecraftClient minecraftClient, KeyBinding keyBinding) {
        Map<Object, Boolean> map = this.I.get(keyBinding);
        if (map == null) return;
        if (map.remove(object) != null) {
            if (!map.isEmpty()) {
                this.I(keyBinding, IIIIlII.Ill(map), false);
                return;
            }
            this.I.remove(keyBinding);
            this.llI(minecraftClient, keyBinding, true);
            return;
        }
    }

    public static IIIIlII IlI() {
        return l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean Ill(Map<Object, Boolean> map) {
        if (map == null) return false;
        if (map.isEmpty()) return false;
        if (!map.containsValue(Boolean.FALSE)) return map.containsValue(Boolean.TRUE);
        return false;
    }

    public void lII(MinecraftClient minecraftClient) {
        if (!this.I.isEmpty() && !IIIIlII.III(minecraftClient)) {
            this.IIIl(minecraftClient, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIl(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        boolean bl;
        if (keyBinding == null) {
            return false;
        }
        Map<Object, Boolean> map = this.I.get(keyBinding);
        if (map != null && !map.isEmpty()) {
            bl = IIIIlII.Ill(map);
            return bl;
        }
        bl = lIIllllI.IIllIII(minecraftClient, keyBinding);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llI(MinecraftClient minecraftClient, KeyBinding keyBinding, boolean bl) {
        boolean bl2 = this.II.getOrDefault(keyBinding, false);
        boolean bl3 = bl && (minecraftClient == null ? bl2 : lIIllllI.IIllIII(minecraftClient, keyBinding));
        this.II.remove(keyBinding);
        this.I(keyBinding, bl3, false);
    }

    public void lll(MinecraftClient minecraftClient) {
        this.IIIl(minecraftClient, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIII(GameOptions gameOptions, Input input) {
        float f;
        float f2;
        boolean bl;
        boolean bl2;
        block4: {
            float f3;
            boolean bl3;
            block2: {
                block3: {
                    block1: {
                        if (!IIIIlII.III(MinecraftClient.getInstance())) return;
                        if (gameOptions == null) return;
                        if (input == null) return;
                        if (this.I.isEmpty()) break block1;
                        PlayerInput playerInput = input.playerInput;
                        bl3 = this.l(gameOptions.forwardKey, playerInput.forward());
                        boolean bl4 = this.l(gameOptions.backKey, playerInput.backward());
                        bl2 = this.l(gameOptions.leftKey, playerInput.left());
                        bl = this.l(gameOptions.rightKey, playerInput.right());
                        boolean bl5 = this.l(gameOptions.jumpKey, playerInput.jump());
                        boolean bl6 = this.l(gameOptions.sneakKey, playerInput.sneak());
                        boolean bl7 = this.l(gameOptions.sprintKey, playerInput.sprint());
                        input.playerInput = new PlayerInput(bl3, bl4, bl2, bl, bl5, bl6, bl7);
                        if (bl3 != bl4) break block2;
                        break block3;
                    }
                    return;
                }
                f3 = 0.0f;
                break block4;
            }
            f3 = f2 = bl3 ? 1.0f : -1.0f;
        }
        float f4 = bl2 != bl ? (bl2 ? 1.0f : -1.0f) : (f = 0.0f);
        if (f2 != 0.0f && f != 0.0f) {
            float f5 = 0.70710677f;
            f2 *= f5;
            f *= f5;
        }
        lIIllllI.lIII(input, f2, f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIIl(MinecraftClient minecraftClient, boolean bl) {
        Iterator<KeyBinding> iterator = Set.copyOf(this.I.keySet()).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.I.clear();
                this.II.clear();
                return;
            }
            KeyBinding keyBinding = iterator.next();
            this.llI(minecraftClient, keyBinding, bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIlI(InputUtil.Key key) {
        KeyBinding keyBinding;
        if (lIIllllI.IlIIlll(key)) {
            return false;
        }
        Iterator<KeyBinding> iterator = this.I.keySet().iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!key.equals((Object)lIIllllI.IlllllI(keyBinding = iterator.next())));
        return true;
    }
}

