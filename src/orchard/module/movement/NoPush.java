/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIllIl
 * Module         : No Push  [MOVEMENT]
 * Description    : Prevents other entities from pushing you via collision.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Ignore In Blocks
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.world.BlockView
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.BlockView;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class NoPush
extends ModuleBase {
    private static volatile NoPush I;
    private final llIll l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Ignore In Blocks"), false));
    private static final String[] II;
    private static final Object[] Il;

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lI(Entity entity, Entity entity2) {
        NoPush noPush = I;
        if (noPush == null) return false;
        if (!noPush.IIIlIIl()) return false;
        if ((Boolean)noPush.l.lIl() == false) return true;
        if (noPush.IIl(entity, entity2)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIl(Entity entity, Entity entity2) {
        if (this.lIl(entity)) return true;
        if (!this.lIl(entity2)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private boolean IlI(PlayerEntity var1_1) {
        block18: {
            block15: {
                block13: {
                    block16: {
                        block17: {
                            block9: {
                                block11: {
                                    block14: {
                                        block12: {
                                            block10: {
                                                break block14;
lbl1:
                                                // 1 sources

                                                while (!(var2_2.getLengthY() <= 0.0)) {
                                                    break block9;
                                                }
                                                break block15;
                                                while (true) {
                                                    var9_9 = var8_8.getCollisionShape((BlockView)var3_3, var7_7);
                                                    break block10;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (var11_11.offset(var7_7).intersects(var2_2)) {
                                                    break block11;
                                                }
                                                break block16;
                                            }
                                            if (!var9_9.isEmpty()) break block17;
                                            break block13;
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = (BlockPos)var6_6.next();
                                                break block12;
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    if (!var8_8.isAir()) ** continue;
                                                    break block13;
                                                    break;
                                                }
                                                break;
                                            }
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var11_11 = (Box)var10_10.next();
                                                ** GOTO lbl7
                                                break;
                                            }
                                        }
                                        var8_8 = var3_3.getBlockState(var7_7);
                                        ** while (true)
                                    }
                                    var2_2 = var1_1.getBoundingBox().contract(0.05, 0.05, 0.05);
                                    if (var2_2.getLengthX() <= 0.0) break block15;
                                    ** GOTO lbl1
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = BlockPos.iterate((BlockPos)var4_4, (BlockPos)var5_5).iterator();
                                        break block13;
                                        break;
                                    }
                                }
                                return true;
lbl34:
                                // 1 sources

                                return false;
                            }
                            if (!(var2_2.getLengthZ() <= 0.0)) break block18;
                            break block15;
                        }
                        var10_10 = var9_9.getBoundingBoxes().iterator();
                    }
                    ** while (var10_10.hasNext())
                }
                ** while (!var6_6.hasNext())
lbl45:
                // 1 sources

                ** while (true)
lbl46:
                // 1 sources

                while (true) {
                    var5_5 = BlockPos.ofFloored((double)var2_2.maxX, (double)var2_2.maxY, (double)var2_2.maxZ);
                    ** continue;
                    break;
                }
            }
            return false;
        }
        var3_3 = var1_1.getEntityWorld();
        var4_4 = BlockPos.ofFloored((double)var2_2.minX, (double)var2_2.minY, (double)var2_2.minZ);
        ** while (true)
    }

    public static void lII() {
        I = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(Entity entity) {
        if (!(entity instanceof PlayerEntity)) return false;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (playerEntity.getEntityWorld() == null) {
            return false;
        }
        if (playerEntity.isInsideWall()) return true;
        if (this.IlI(playerEntity)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public NoPush() {
        super(StringFactory.IIII("tpsUrAxEWA=="), Category.ll, StringFactory.IIII("qIZRihxZRA/XB4tRCsGem5aAXYgQUkNckRqQVE/Dy42QnVqbWU5fCdcellhP0NGSlJ1HlRZZHg=="));
        I = this;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 27098;
        String string = "\uaf2a\uaf26\uaf21\uaf07\uaf24\uaf13\uaf2e\uaf17\uaf05\uaf13\uaf6f\uaf6f\u7924\u791c\u790b\u7903\u79bc\u7939\u7929\u790b\u7903\u7914\u7902\u7909\u7913\u7965\u7925\u7903\u7916\u7926\u791a\u7938\u79c0\u7968\u7934\u7914\u7909\u790c\u793a\u7904\u7908\u79be\u791f\u7936\u79be\u7903\u7924\u7904\u7907\u7918\u7902\u7915\u792c\u7965\u7963\u7904\u79bf\u7907\u7924\u7933\u790a\u7908\u7968\u7937\u7916\u7935\u7936\u7938\u79bd\u79bd\u7939\u7901\u7961\u791f\u791a\u7906\u79bd\u791b\u7964\u7919\u79bd\u7903\u790b\u790b\u7919\u793a\u7970\u7970\u9a53\u99fe\u9a72\u9a41\u9a4b\u9a57\u9a58\u9a73\u9a65\u9a68\u9a77\u99fe\u9a73\u9a70\u9a11\u9a7a\u9a61\u9a72\u9a68\u9a7a\u9a4e\u9a71\u9a1d\u9a1d";
        char[] cArray = "\u69d6\u6996\u69c2".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        II = stringArray;
        Il = new Object[stringArray.length];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xA325;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            NoPush.Il[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6FF7;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 62213;
            n7 ^= 0x1E41;
            n7 += 65396;
            n7 -= 49063;
            cArray[n6] = (char)((n7 += 1964) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

