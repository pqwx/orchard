/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlI
 * Module         : AntiBot  [COMBAT]
 * Description    : Detects and ignores anti-cheat bots instantly across servers.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Invisible Bot Check
 *   - Malformed Identity
 *   - Duplicate Identity
 *   - Position Movement
 *   - Air Floating Bot
 *   - TabList Absence
 *   - Zero Ping Check
 *   - Entity ID Check
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.module.combat;

import com.mojang.authlib.GameProfile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIllIIll;
import orchard.internal.IIlIlllIl;
import orchard.internal.IlIlIlIlI;
import orchard.internal.IlIlIlllI;
import orchard.internal.lIlIIIII;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.lllIlIl;

@Environment(value=EnvType.CLIENT)
public final class AntiBot
extends ModuleBase {
    private static final double I = 144.0;
    private final llIll l;
    private Object II;
    private lllIlIl Il;
    private static String[] lI;
    private final llIll ll;
    private static final int III = 200;
    private final llIll IIl;
    private final Map<Integer, IIlIlllIl> IlI;
    private final llIll Ill;
    private final llIll lII;
    private final lIlIIlI lIl;
    private UUID llI;
    private final llIll lll;
    private final IIIIIIIIl<IIIllIIll> IIII = this.IIlllIl(new IIIIIIIIl<IIIllIIll>(StringFactory.IIII("Mode"), IIIllIIll.class, IIIllIIll.Il));
    private static final double IIIl = 0.005;
    private final llIll IIlI;
    private final llIll IIll;
    private static final int[] IlII;
    private static final String[] IlIl;
    private static final Object[] IllI;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        if (minecraftClient.player == null) return false;
        if (playerEntity == minecraftClient.player) return false;
        double d = playerEntity.squaredDistanceTo((Entity)minecraftClient.player);
        if (d > 144.0) {
            return false;
        }
        if (this.lII(playerEntity)) {
            return false;
        }
        if (playerEntity.isOnGround()) return false;
        if (!(Math.abs(playerEntity.getVelocity().y) <= 0.005)) return false;
        if (!(playerEntity.fallDistance <= 0.0)) return false;
        return true;
    }

    @Override
    public void llll() {
        this.Illl();
    }

    /*
     * Unable to fully structure code
     */
    private boolean IIl(MinecraftClient var1_1, PlayerEntity var2_2, String var3_3) {
        block19: {
            block28: {
                block29: {
                    block14: {
                        block26: {
                            block15: {
                                block23: {
                                    block13: {
                                        block27: {
                                            block24: {
                                                block20: {
                                                    block22: {
                                                        block21: {
                                                            block18: {
                                                                block16: {
                                                                    block25: {
                                                                        var4_4 = var2_2.getGameProfile();
                                                                        if (var4_4 != null) break block25;
                                                                        break block26;
                                                                        return false;
lbl6:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            block17: {
                                                                                var9_9 = v0;
                                                                                if (var8_8 != null) break block13;
                                                                                break block14;
lbl10:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var12_12 = v1;
                                                                                    if (var11_11) break block15;
                                                                                    break block16;
                                                                                    break;
                                                                                }
lbl14:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    v2 = true;
                                                                                    break block17;
                                                                                    break;
                                                                                }
lbl17:
                                                                                // 1 sources

                                                                                while (var9_9 != null) {
                                                                                    break block18;
                                                                                }
                                                                                break block19;
lbl20:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var7_7.isAlive()) break block20;
                                                                                    break block21;
                                                                                    break;
                                                                                }
                                                                            }
lbl24:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var11_11 = v2;
                                                                                if (var5_5 == null) break block22;
                                                                                break block23;
                                                                                break;
                                                                            }
lbl28:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var7_7 = (PlayerEntity)var6_6.next();
                                                                                if (var7_7 == var2_2) break block21;
                                                                                break block24;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    v3 = IlIlIlllI.III(var4_4);
                                                                    break block27;
                                                                }
                                                                if (!var12_12) break block21;
                                                                break block15;
                                                            }
                                                            if (var3_3.equalsIgnoreCase(var9_9)) {
                                                                ** continue;
                                                            }
                                                            break block19;
                                                        }
lbl43:
                                                        // 3 sources

                                                        while (true) {
                                                            if (!var6_6.hasNext()) ** continue;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
lbl47:
                                                    // 2 sources

                                                    while (true) {
                                                        v1 = false;
                                                        ** GOTO lbl10
                                                        break;
                                                    }
                                                }
                                                var8_8 = var7_7.getGameProfile();
                                                if (var8_8 == null) break block28;
                                                v0 = IlIlIlllI.ll(var8_8);
                                                ** GOTO lbl6
                                            }
                                            if (var7_7.isRemoved()) ** GOTO lbl43
                                            ** while (true)
                                        }
lbl59:
                                        // 2 sources

                                        while (true) {
                                            var5_5 = v3;
                                            var6_6 = var1_1.world.getPlayers().iterator();
                                            ** continue;
                                            break;
                                        }
lbl63:
                                        // 1 sources

                                        while (true) {
                                            v1 = true;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    v4 = IlIlIlllI.III(var8_8);
                                    break block29;
                                }
                                ** while (!var5_5.equals((Object)var10_10))
lbl71:
                                // 1 sources

                                ** while (true)
                            }
                            return true;
                        }
                        v3 = null;
                        ** while (true)
                    }
                    v4 = var10_10 = null;
                }
                if (var3_3 == null) break block19;
                ** GOTO lbl17
            }
            v0 = null;
            ** while (true)
        }
        v2 = false;
        ** while (true)
    }

    private void IlI() {
        lllIlIl lllIlIl2 = new lllIlIl((IIIllIIll)((Object)this.IIII.lIl()), (Boolean)this.IIl.lIl(), (Boolean)this.IIlI.lIl(), (Boolean)this.ll.lIl(), (Boolean)this.lII.lIl(), (Boolean)this.l.lIl(), (Boolean)this.IIll.lIl(), (Boolean)this.lll.lIl(), (Boolean)this.Ill.lIl(), Double.doubleToLongBits((Double)this.lIl.lIl()));
        if (!lllIlIl2.equals(this.Il)) {
            this.IlI.clear();
            this.Il = lllIlIl2;
        }
    }

    @Override
    public void ll() {
        this.Illl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(PlayerEntity playerEntity) {
        if (playerEntity.isGliding()) return true;
        if (playerEntity.hasVehicle()) return true;
        if (playerEntity.isSpectator()) return true;
        if (playerEntity.getAbilities().creativeMode) {
            if (playerEntity.getAbilities().flying) return true;
        }
        if (playerEntity.getAbilities().flying) return true;
        if (playerEntity.isTouchingWater()) return true;
        if (playerEntity.isSubmergedInWater()) return true;
        if (playerEntity.isInLava()) return true;
        if (playerEntity.isClimbing()) return true;
        if (playerEntity.hasStatusEffect(StatusEffects.LEVITATION)) return true;
        if (playerEntity.hasStatusEffect(StatusEffects.SLOW_FALLING)) return true;
        if (playerEntity.isUsingRiptide()) return true;
        return false;
    }

    private static String lIl(char[] cArray, long l2, int n) {
        int n2 = 0x1B09C6AA ^ n;
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
     * Enabled aggressive block sorting
     */
    public boolean lll(PlayerEntity playerEntity) {
        UUID uUID;
        String string;
        GameProfile gameProfile;
        if (!this.IIIlIIl()) return false;
        if (playerEntity == null) return false;
        if (playerEntity.isRemoved()) return false;
        if (!playerEntity.isAlive()) return false;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIlI(minecraftClient)) return false;
        if (playerEntity == minecraftClient.player) return false;
        long l2 = minecraftClient.world.getTime();
        IIlIlllIl iIlIlllIl = this.IlII(minecraftClient, playerEntity, l2);
        boolean bl = iIlIlllIl != null && l2 - iIlIlllIl.lI >= ((Double)this.lIl.lIl()).longValue();
        boolean bl2 = bl;
        if (bl2 && ((Boolean)this.IIl.lIl()).booleanValue() && minecraftClient.getNetworkHandler() != null) {
            gameProfile = minecraftClient.getNetworkHandler().getPlayerListEntry(playerEntity.getUuid());
            if (gameProfile == null) {
                return true;
            }
            string = gameProfile.getProfile();
            uUID = playerEntity.getGameProfile();
            String string2 = string == null ? null : IlIlIlllI.ll((GameProfile)string);
            String string3 = uUID == null ? null : IlIlIlllI.ll((GameProfile)uUID);
            if (string2 == null) return true;
            if (string3 == null) return true;
            if (!string2.equalsIgnoreCase(string3)) {
                return true;
            }
        }
        if (((Boolean)this.ll.lIl()).booleanValue()) {
            gameProfile = playerEntity.getGameProfile();
            string = gameProfile == null ? null : IlIlIlllI.ll(gameProfile);
            uUID = gameProfile == null ? null : IlIlIlllI.III(gameProfile);
            if (string == null) return true;
            if (string.isEmpty()) return true;
            if (string.length() < 2) return true;
            if (string.length() > 16) return true;
            if (string.contains(StringFactory.IIl("OlM="))) return true;
            if (string.contains("[")) return true;
            if (string.contains("]")) return true;
            if (string.contains(" ")) {
                return true;
            }
            if (uUID != null) {
                if (uUID.version() == 2) return true;
            }
        }
        if (((Boolean)this.lII.lIl()).booleanValue() && playerEntity.isInvisible()) {
            if (!playerEntity.hasStatusEffect(StatusEffects.INVISIBILITY)) return true;
        }
        if (bl2 && ((Boolean)this.IIll.lIl()).booleanValue()) {
            if (this.lI(minecraftClient, playerEntity)) return true;
        }
        if (((Boolean)this.lll.lIl()).booleanValue() && this.IIl(minecraftClient, playerEntity, string = (gameProfile = playerEntity.getGameProfile()) != null ? IlIlIlllI.ll(gameProfile) : null)) {
            return true;
        }
        if (((Boolean)this.Ill.lIl()).booleanValue()) {
            if (playerEntity.getId() < 0) return true;
            if (playerEntity.getId() >= 1000000000) {
                return true;
            }
        }
        if (iIlIlllIl == null) return false;
        if (!iIlIlllIl.II.Ill((IIIllIIll)((Object)this.IIII.lIl())).I()) return false;
        return true;
    }

    private static void IIII() {
        AntiBot.lI[0] = AntiBot.lIl(AntiBot.lIIl(-1925334595, -443073280).toCharArray(), 53623L, -1665590754);
        AntiBot.lI[1] = AntiBot.lIl(AntiBot.lIIl(-1925334596, -1111852639).toCharArray(), 18311L, 1117713059);
        AntiBot.lI[2] = AntiBot.lIl(AntiBot.lIIl(-1925334593, 1434525898).toCharArray(), 58615L, -1719811042);
        AntiBot.lI[3] = AntiBot.lIl(AntiBot.lIIl(-1925334594, 364785677).toCharArray(), 18101L, 406296991);
        AntiBot.lI[4] = AntiBot.lIl(AntiBot.lIIl(-1925334599, -1247928935).toCharArray(), 48409L, 1126186835);
        AntiBot.lI[5] = AntiBot.lIl(AntiBot.lIIl(-1925334600, -1871107237).toCharArray(), 11761L, 1567173942);
        AntiBot.lI[6] = AntiBot.lIl(AntiBot.lIIl(-1925334597, 285361287).toCharArray(), 20631L, -1661842728);
        AntiBot.lI[7] = AntiBot.lIl(AntiBot.lIIl(-1925334598, -313316276).toCharArray(), 79182L, 1430384940);
        AntiBot.lI[8] = AntiBot.lIl(AntiBot.lIIl(-1925334603, 641489011).toCharArray(), 95954L, 643871584);
        AntiBot.lI[9] = AntiBot.lIl(AntiBot.lIIl(-1925334604, -705682425).toCharArray(), 23876L, 39752743);
        AntiBot.lI[10] = AntiBot.lIl(AntiBot.lIIl(-1925334601, -742306646).toCharArray(), 40390L, 1713600082);
        AntiBot.lI[11] = AntiBot.lIl(AntiBot.lIIl(-1925334602, -1939982697).toCharArray(), 39165L, -566445302);
        AntiBot.lI[12] = AntiBot.lIl(AntiBot.lIIl(-1925334607, -444061882).toCharArray(), 92153L, 1971258563);
        AntiBot.lI[13] = AntiBot.lIl(AntiBot.lIIl(-1925334608, -153599726).toCharArray(), 72407L, -432279583);
        AntiBot.lI[14] = AntiBot.lIl(AntiBot.lIIl(-1925334605, -1892390555).toCharArray(), 76608L, 272229057);
        AntiBot.lI[15] = AntiBot.lIl(AntiBot.lIIl(-1925334606, 638594795).toCharArray(), 64485L, -789204197);
        AntiBot.lI[16] = AntiBot.lIl(AntiBot.lIIl(-1925334611, 589526942).toCharArray(), 51668L, -111360384);
    }

    public AntiBot() {
        super(StringFactory.IIII("AntiBot"), Category.II, StringFactory.IIII("Detects and ignores anti-cheat bots instantly across servers."));
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("TabList Absence"), true));
        this.IIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Zero Ping Check"), true));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Malformed Identity"), true));
        this.lII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Invisible Bot Check"), true));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Position Movement"), true));
        this.IIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Air Floating Bot"), true));
        this.lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Duplicate Identity"), true));
        this.Ill = this.IIlllIl(new llIll((Object)StringFactory.IIII("Entity ID Check"), true));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Grace Period"), 40.0, 0.0, 200.0, 10.0).IIIl("ticks"));
        this.IlI = new HashMap<Integer, IIlIlllIl>();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.world == null || minecraftClient.player == null) {
            this.Illl();
            return false;
        }
        UUID uUID = minecraftClient.player.getUuid();
        if (this.II != minecraftClient.world || !uUID.equals(this.llI)) {
            this.IlI.clear();
            this.II = minecraftClient.world;
            this.llI = uUID;
        }
        this.IlI();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIlI(minecraftClient)) {
            return;
        }
        long l2 = minecraftClient.world.getTime();
        Iterator iterator = minecraftClient.world.getPlayers().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.IlI.entrySet().removeIf(entry -> lIlIIIII.ll(l2, ((IIlIlllIl)entry.getValue()).I, 200L));
                return;
            }
            PlayerEntity playerEntity = (PlayerEntity)iterator.next();
            this.IlII(minecraftClient, playerEntity, l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIlIlllIl IlII(MinecraftClient minecraftClient, PlayerEntity playerEntity, long l2) {
        if (playerEntity == null) return null;
        if (playerEntity == minecraftClient.player) {
            return null;
        }
        int n = playerEntity.getId();
        IIlIlllIl iIlIlllIl = this.IlI.get(n);
        if (iIlIlllIl == null || iIlIlllIl.l != playerEntity) {
            iIlIlllIl = new IIlIlllIl(playerEntity, l2);
            this.IlI.put(n, iIlIlllIl);
        }
        iIlIlllIl.I = l2;
        if (iIlIlllIl.Il == l2) {
            return iIlIlllIl;
        }
        iIlIlllIl.Il = l2;
        boolean bl = l2 - iIlIlllIl.lI >= ((Double)this.lIl.lIl()).longValue();
        boolean bl2 = (Boolean)this.IIl.lIl() == false || minecraftClient.getNetworkHandler() == null || minecraftClient.getNetworkHandler().getPlayerListEntry(playerEntity.getUuid()) != null;
        GameProfile gameProfile = playerEntity.getGameProfile();
        String string = gameProfile == null ? null : IlIlIlllI.ll(gameProfile);
        boolean bl3 = (Boolean)this.ll.lIl() == false || lIlIIIII.I(string);
        boolean bl4 = (Boolean)this.lll.lIl() != false && this.IIl(minecraftClient, playerEntity, string);
        boolean bl5 = playerEntity.squaredDistanceTo((Entity)minecraftClient.player) <= 144.0;
        boolean bl6 = (Boolean)this.l.lIl() == false || this.lII(playerEntity);
        boolean bl7 = (Boolean)this.IIll.lIl() != false && bl5 && this.IllI(playerEntity);
        double d = Math.hypot(playerEntity.getVelocity().x, playerEntity.getVelocity().z);
        iIlIlllIl.II.l(new IlIlIlIlI(l2, bl, bl2, bl3, (Boolean)this.lII.lIl() != false && bl5 && playerEntity.isInvisible() && !playerEntity.hasStatusEffect(StatusEffects.INVISIBILITY), bl4, bl7, bl6, bl5, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), d), (IIIllIIll)((Object)this.IIII.lIl()));
        return iIlIlllIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(PlayerEntity playerEntity) {
        if (playerEntity.isOnGround()) return false;
        if (this.lII(playerEntity)) return false;
        if (!(Math.abs(playerEntity.getVelocity().y) <= 0.005)) return false;
        if (!(playerEntity.fallDistance <= 0.0)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block31: {
                block34: {
                    block32: {
                        block35: {
                            block33: {
                                block30: {
                                    break block33;
lbl1:
                                    // 2 sources

                                    while (true) {
                                        continue;
lbl3:
                                        // 1 sources

                                        while (true) {
                                            break block29;
                                            break;
                                        }
lbl5:
                                        // 1 sources

                                        while (true) {
                                            v0 = 8;
                                            break block30;
                                            break;
                                        }
lbl8:
                                        // 1 sources

                                        while (true) {
                                            v0 = 52;
                                            break block30;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            v0 = 14;
                                            break block30;
                                            break;
                                        }
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        var13_8 = 0;
                                        break block31;
                                        break;
                                    }
lbl17:
                                    // 2 sources

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
                                        v0 = 43;
                                        break block30;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var11_6 += var12_7;
                                        break block32;
                                        break;
                                    }
                                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                    break block34;
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var4_15 = 0;
                                        ** GOTO lbl17
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        v1 = var15_10++;
                                        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                                        ** continue;
                                        break;
                                    }
                                }
lbl39:
                                // 2 sources

                                while (true) {
                                    var16_1 = v0;
                                    ** continue;
                                    break;
                                }
lbl42:
                                // 1 sources

                                while (true) {
                                    var13_8 = -1;
                                    break block31;
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
                                    continue;
                                    break;
                                }
lbl49:
                                // 1 sources

                                while (true) {
                                    v0 = 16;
                                    ** continue;
                                    break;
                                }
                            }
                            var6 = 3174;
                            var7_2 = "\u3690\ufcd8\u172f\u65be\uf3bb\u3433\u5817\u8510\uac00\u453d\uee90\u3ce3\ue17a\u6ce3\u5b71\u7d71\u2153\u9c77\u9c8c\u4ea1\u8af0\uce03\u9a39\u2068\u3141\u7a7d\u7a00\u835d\u7ca3\uc0a8\u8c8c\u4bc0\u997e\u2339\u66b7\ud43f\u3c94\udf60\u1fbb\u7ea0\u7341\u2da5\u7407\uccb3\u219b\u3df4\ue2a9\uc5b8\u385f\u9266\u1477\u617d\ue523\u11ef\u8b44\u85d2\u38ec\u8724\u53a7\u38d6\u380d\ub075\u0592\ua523\u2d5a\u86f7\uf3dd\u4ba5\u040f\ud756\u2219\u374d\u6c9f\u03c7\ub548\u08f5\u59c7\ud66f\u9ea3\u6a11\ue2c4\u3242\ua796\u6b9a\u4b45\uf6b6\uf4e8\ud8bc\u3b91\u516b\u884a\uc3ef\u5230\u70c0\u5e1a\ubda9\ud4e2\u5c96\uff8d\u8044\uca16\uf661\u5bc8\ub8e2\u1c9f\u0cb7\u2989\uef5e\u3829\u0266\ud7fa\uc4f8\u2e96\u304e\ubacc\ua908\uaad5\ucc8f\ued75\u48ae\u76e5\ub3d1\ufc83\ua0ab\u2a57\ub31b\u1704\u891d\ub1b0\u06ed\ufa2c\u656d\ue614\u1792\u94e5\u3acd\u7149\ua200\ud30e\uc4cc\u655b\uc55d\u0185\u3fb3\u7357\u8cb2\u9fee\u0c32\ua9ca\u6ae7\u69aa\u31ad\ue422\u0235\ub261\ub633\u0258\udf8e\ucc7b\u459d\u096f\u0a39\ue14e\uceb2\u751d\u5d94\u1598\udd64\uf4d1\u48fd\uf05d\uf8c3\ub401\ub54f\u3386\u29e3\ud127\u3f85\ua336\u765e\u54e0\u8178\ue894\u8d49\ucc3f\u4225\ue858\u6524\u49e5\u7a84\u1f66\u803c\u2019\uc7f5\u945e\u1e62\u311f\u0fe0\u4961\u6332\ud368\ue2ed\uf059\ufd0e\u6262\u111d\u4193\udcc1\ubf73\uadd7\u1388\u9dd7\u6ef6\u36e4\ufda3\u0c42\u2440\u2067\ue940\u6b24\u6f31\u100f\ua2e9\ud552\ub39b\ufc99\u5e83\u27a1\u7fdb\u139d\u25ea\u42af\u1776\ua756\u3ce8\u11a5\ub87f\u7f05\u399f\u2b82\u95dc\u8da5\u71df\u6295\udba7\ue97e\u9a49\u2614\u1c5d\u47b0\u839a\u7ea8\ude2c\u70d8\u6d6a\ufab2\ud813\u7764\u96f2\u5924\uc722\u904d\u1b49\u445d\u757f\u76a4\ucf87\u4836\u21c9\u0199\ubf3e\u6207\uf029\u44e7\u150a\u7596\u3b15\u6bd2\ud2d3\ubf04\ucce0\ue800\u993d\u610e\u4501\u5a8f\ufd12\u9eff\u5c70\u97e9\u75f2\u54d9\u30ec\u8cca\u6fd2\uf788\u1923\uafea\u2524\uc8ea\u6f85\uec3b\u9720\ub918\ucf3b\u366d\u721e\u6322\u4ff9\u141b\u8ed6\u4ae1\u1178\u7f72\u2d53\ubd9f\ud05c\u2b86\u9d76\u2d2b\uca61\ue386\ub7e3\u3d23\u519d\u3964\uec61\ue214";
                            ** while (true)
lbl56:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            var12_7 = var8_3[var10_5] ^ var6;
                            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                            var15_10 = 0;
                            break block35;
lbl62:
                            // 1 sources

                            while (true) {
                                var3_14 = 0;
                                ** continue;
                                break;
                            }
lbl65:
                            // 1 sources

                            while (true) {
                                AntiBot.lI = new String[17];
                                AntiBot.IIII();
                                return;
                            }
lbl69:
                            // 1 sources

                            while (true) {
                                var9_4[var10_5] = new String(var14_9).intern();
                                ** continue;
                                break;
                            }
                        }
lbl73:
                        // 2 sources

                        while (true) {
                            switch (var15_10 % 5) {
                                case 4: {
                                    ** continue;
                                }
                                case 1: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                case 3: {
                                    ** continue;
                                }
                                ** case 2:
lbl84:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    if (++var10_5 < var8_3.length) ** GOTO lbl1
                    ** while (true)
                }
                AntiBot.IlII[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
                if (++var4_15 >= var1_12) ** break;
                ** while (true)
                ** while (true)
                AntiBot.IlIl = var9_4;
                AntiBot.IllI = new Object[var9_4.length];
                ** while (true)
                var1_12 = var0_11.length / 4;
                AntiBot.IlII = new int[var1_12];
                ** while (true)
                var12_7 = 0;
                if (var13_8 == 0) ** break;
                ** while (true)
                ** while (true)
            }
            var10_5 = 0;
            var11_6 = 0;
            ** while (true)
        }
        ** while (var15_10 < var14_9.length)
lbl110:
        // 1 sources

        ** while (true)
        var2_13 = 771666217;
        var0_11 = "\u00a5A\u000bn\u0087\u0017\u0098\u00afX\u00ffX\u00a6Vd\u0093\u00a0\u0019\u00cd\u00edv\u00bc\u00ff\u008e\u008f*\u008d\b\u00c4m\u00d2\r\u00ce\u00f5\u00d4&\u0081h;\u0019\u00acB\u00da\u0088\u00a5\u00a8\u00ce\u00b4\u00c7\u00d6\u00f7\u00dbRJ\fM1-\u0092\u0005J\u009dB\u00f8\u00ed\u00b4r\u00fe\u00bf\u008a:\u00ad\u00d3\u001fS\u00e5\u00e9\u00e52\u00e6\u00b9\u000b\u00a5\u009ci?\u00cb\u00fc\u00f7>\n}\u00f4\u00b7\u0095\u00ddt\u00ec\u00b8\u0096\u001d\u00a9\u00d5\u0015\u00e6\u00fc\u000f\u0000\u0012;l|FBd\u00fc-;;JR[-f\u00c2\u001d\u009fA\u00e1'\u00f8\u00f3\u00e3\u0003\u00af\r9wKc\u00d4\u0089M\u0014\u00c8\u0007\u00f4\u00a4cr7G\u00ee\u00c4]7\u008bf\u001c\u00fb\u00a02\u00161\u00cb\u00f6 \u00b3u\u00aa\u00cat\u00bb\u00b4\u00a2\u00d8R".getBytes("ISO-8859-1");
        ** while (true)
        var8_3 = "\u0c72\u0c7e\u0c72\u0c6a\u0c7e\u0c7e\u0c6e\u0c6e\u0c32\u0c7a\u0c72\u0c76\u0c7e\u0c62\u0c62\u0c62\u0c62".toCharArray();
        var9_4 = new String[var8_3.length];
        ** while (true)
    }

    private void Illl() {
        this.IlI.clear();
        this.II = null;
        this.llI = null;
        this.Il = null;
    }

    private static int lIII(int n, int n2) {
        return IlII[n ^ 0x495299BB] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lIIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8D3DB9BD;
        char[] cArray = IlIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AntiBot.IllI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4A61E693;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 17 -> 9;
                case 30 -> 224;
                case 8 -> 212;
                case 28 -> 140;
                case 25 -> 0;
                case 20 -> 2;
                case 13 -> 127;
                case 31 -> 130;
                case 24 -> 6;
                default -> 127;
                case 16 -> 143;
                case 22 -> 133;
                case 7 -> 85;
                case 26 -> 89;
                case 21 -> 157;
                case 9 -> 239;
                case 5 -> 23;
                case 18 -> 142;
                case 29 -> 33;
                case 3 -> 242;
                case 27 -> 42;
                case 12 -> 64;
                case 11 -> 105;
                case 23 -> 104;
                case 14 -> 152;
                case 2 -> 45;
                case 1 -> 30;
                case 6 -> 32;
                case 4 -> 75;
                case 15 -> 132;
                case 10 -> 111;
                case 19 -> 135;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

