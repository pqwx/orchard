/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIll
 * Module         : HitMarker  [RENDER]
 * Description    : Plays a hitmarker sound and draws a marker on your crosshair after a hit.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Duration
 *   - Visual
 *   - Sound
 *   - cats
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
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.projectile.ProjectileEntity
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIlIIl;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class HitMarker
extends ModuleBase {
    private static final IIIlIIIII I;
    private final llIll l;
    private final Map<Integer, IIlIIl> II;
    private final llIll Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Sound"), true));
    private long lI;
    private static final IIIlIIIII ll;
    private static final double III = 16.0;
    private static final long IIl = 2500L;
    private final lIlIIlI IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Enabled aggressive block sorting
     */
    public HitMarker() {
        super(StringFactory.IIII("HitMarker"), Category.l, StringFactory.IIII("Plays a hitmarker sound and draws a marker on your crosshair after a hit."));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Visual"), true));
        this.IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Duration"), 220.0, 60.0, 1000.0, 10.0).IIII(StringFactory.IIII("ms")));
        this.II = new HashMap<Integer, IIlIIl>();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        long l2;
        if ((Boolean)this.l.lIl() == false) return;
        if (this.lI <= 0L) return;
        long l3 = System.currentTimeMillis();
        long l4 = l3 - this.lI;
        if (l4 > (l2 = Math.max(1L, Math.round((Double)this.IlI.lIl())))) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.getWindow() == null) {
            return;
        }
        double d = (double)l4 / (double)l2;
        int n3 = (int)Math.round((1.0 - d) * 255.0);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Color color = clientEntrypoint == null || clientEntrypoint.IlI() == null || clientEntrypoint.IlI().lIIIII() == null ? Color.WHITE : clientEntrypoint.IlI().lIIIII().IIlll();
        int n4 = lIlIllI.Ill(color, n3).getRGB();
        double d2 = (double)minecraftClient.getWindow().getScaledWidth() * 0.5;
        double d3 = (double)minecraftClient.getWindow().getScaledHeight() * 0.5;
        double d4 = 3.5 + d * 1.0;
        double d5 = 5.0;
        IIIlI.Illlll(drawContext, d2 - d4 - d5, d3 - d4 - d5, d2 - d4, d3 - d4, 0.9, n4);
        IIIlI.Illlll(drawContext, d2 + d4, d3 - d4, d2 + d4 + d5, d3 - d4 - d5, 0.9, n4);
        IIIlI.Illlll(drawContext, d2 - d4 - d5, d3 + d4 + d5, d2 - d4, d3 + d4, 0.9, n4);
        IIIlI.Illlll(drawContext, d2 + d4, d3 + d4, d2 + d4 + d5, d3 + d4 + d5, 0.9, n4);
    }

    @Override
    public void III() {
        this.I(MinecraftClient.getInstance());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llI(Entity entity, byte by) {
        IIlIIl iIlIIl;
        if (!(entity instanceof LivingEntity)) return;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (livingEntity.isRemoved()) return;
        if (!this.IlI(by)) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (entity == minecraftClient.player) {
            return;
        }
        long l2 = System.currentTimeMillis();
        Vec3d vec3d = new Vec3d(entity.getX(), entity.getY(), entity.getZ());
        Iterator<IIlIIl> iterator = this.II.values().iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (l2 - (iIlIIl = iterator.next()).l() > 2500L || !(iIlIIl.I().squaredDistanceTo(vec3d) <= 16.0));
        this.lI();
    }

    /*
     * Unable to fully structure code
     */
    private void I(MinecraftClient var1_1) {
        block11: {
            block13: {
                block14: {
                    block10: {
                        if (var1_1 == null) break block11;
                        break block14;
                        while (true) {
                            break block10;
                            break;
                        }
lbl5:
                        // 1 sources

                        while (true) {
                            if (var1_1.world != null) ** continue;
                            break block11;
                            break;
                        }
                    }
                    var2_2 = System.currentTimeMillis();
                    var4_3 = this.II.entrySet().iterator();
                    ** GOTO lbl39
                }
                if (var1_1.player == null) break block11;
                ** while (true)
lbl15:
                // 1 sources

                while (true) {
                    this.II.put(var6_5.getId(), new IIlIIl(new Vec3d(var6_5.getX(), var6_5.getY(), var6_5.getZ()), var2_2));
                    ** GOTO lbl-1000
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var4_3.remove();
                    ** if (true) goto lbl26
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    block4: while (true) lbl-1000:
                    // 2 sources

                    {
                        if (var2_2 - var4_3.next().getValue().l() > 2500L) {
                            ** continue;
                        }
                        ** GOTO lbl39
                        break;
                    }
                }
lbl26:
                // 1 sources

                ** GOTO lbl39
lbl-1000:
                // 3 sources

                {
                    block12: {
                        block5: while (true) {
                            if (!var5_4.hasNext()) break block4;
                            break block12;
lbl30:
                            // 1 sources

                            while (true) {
                                if (!(var6_5 instanceof ProjectileEntity)) continue block5;
                                break block13;
                                break;
                            }
                            break;
                        }
                        while (true) {
                            var5_4 = var1_1.world.getEntities().iterator();
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    var6_5 = (Entity)var5_4.next();
                    ** continue;
lbl39:
                    // 3 sources

                    if (!var4_3.hasNext()) ** continue;
                    ** while (true)
                }
                return;
            }
            ** while ((var7_6 = (ProjectileEntity)var6_5).getOwner() == var1_1.player)
lbl44:
            // 1 sources

            ** while (true)
        }
        this.II.clear();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 23691;
        String string = "\u0be0\u0ba5\u0d1e\u0bae\u0be0\u0bfd\u0c0b\u0bb1\u0bf4\u0bdb\u0bfa\u0bb1\u0d04\u0caf\u0cd9\u0cb3\u0cd9\u0ca4\u0cd6\u0ca9\u0cb0\u0cb3\u0cfc\u0ce3\u0cf4\uf19c\u0d0d\u0cb0\u0cfd\u0ce2\u0cf9\u0cb3\u0cd8\uf24d\u0d07\u0cb0\u0ca7\uf250\u0cf8\u0cf8\u0cae\u0cb3\u0ca7\u0cf2\u0cd5\u0cde\u0cd4\u0cd7\u0cfe\u0ca4\u0d13\u0cf7\uf222\uf24d\u0cd8\u0cf5\uf244\u0d03\u0ca9\u0cf2\u0d03\u0d03\uf19f\u0d12\u0d03\uf250\u0cac\u0cd4\uf222\uf244\uf19c\u0cf7\u0d0a\uf249\u0ce0\u0ca7\u0d0f\uf19c\uf19c\u0cb0\u0cdb\u0d0e\u0d0d\uf19c\u0ca4\u0d0e\uf24a\u0ce3\u0d12\uf19f\uf19f\u0cf5\u0cad\uf23c\u0cf5\uf19c\u0d0c\u0d11\uf247\u0cfe\u0d03\u0caf\uf244\uf19f\u0ca9\uf244\u0d0a\u0cac\uf247\u0ca4\uf248\uf248\ucb9b\ucc8f\ucbca\ucc68\ucbcd\ucbce\ucc56\ucc57\u0091\u0087\uffa2/\u008a1\u008fa\u431c\u4263\u428c\u4259\u4274\u428b\u426b\u422f\u428e\u422e\u4263\u4267\uea3c\uea35\uea53\ue4d9\ua77e\ua766\ua785\ua78a\ua781\ua728\ua76e\ua76e\u7802\u7810\u7801\u77ab\u77f7\u77b1\u7939\u7805";
        char[] cArray = "\u5c87\u5cef\u5c83\u5c83\u5c87\u5c8f\u5c83\u5c83".toCharArray();
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
        lII = stringArray;
        lIl = new Object[stringArray.length];
        int n6 = 1348461338;
        byte[] byArray = "\u0015\u00bf\u00ff\u00b3:\u00cb\u00ba\u00fb\u00c9\u00cb\u0017\u00a3".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Ill = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            HitMarker.Ill[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        I = StringFactory.IIII("cats");
        ll = StringFactory.IIII("h8k2d4");
    }

    @Override
    public void llll() {
        this.lI = 0L;
        this.II.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI() {
        this.lI = System.currentTimeMillis();
        if (((Boolean)this.Il.lIl()).booleanValue()) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            if (minecraftClient == null) return;
            if (minecraftClient.getSoundManager() == null) return;
            minecraftClient.getSoundManager().play((SoundInstance)PositionedSoundInstance.ui((SoundEvent)HitMarker.IIl(), (float)1.0f, (float)1.0f));
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void IlIIlI(Entity entity) {
        LivingEntity livingEntity;
        if (!(entity instanceof LivingEntity) || (livingEntity = (LivingEntity)entity).isRemoved()) {
            return;
        }
        this.lI();
    }

    private static SoundEvent IIl() {
        return SoundEvent.of((Identifier)Identifier.of((String)I.IIII(), (String)ll.IIII()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(byte by) {
        if (by == 2) return true;
        if (by == 33) return true;
        if (by == 36) return true;
        if (by == 37) return true;
        return false;
    }

    private static int lII(int n, int n2) {
        return Ill[n ^ 0xD802FB41] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(short s, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xD8B4;
        char[] cArray = lII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            HitMarker.lIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x66FE;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 25752;
            n7 -= 19196;
            n7 ^= 0x32AE;
            n7 += 20047;
            n7 ^= 0x1CFB;
            n7 ^= 0xFF71;
            n7 += 1303;
            n7 += 49394;
            n7 -= 42357;
            cArray[n6] = (char)((n7 -= 29585) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

