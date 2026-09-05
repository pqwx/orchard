/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Priority Chest
 *   - Priority Head
 *   - Priority Legs
 *   - Aim Part
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.Illll;

@Environment(value=EnvType.CLIENT)
public interface IIlllllIl {
    public static final IIIlIIIII IlllIll;
    public static final IIIlIIIII IllllII;
    public static final IIIlIIIII IllllIl;
    public static final IIIlIIIII IlllllI;
    public static final String[] IlIlIIl;
    public static final Object[] IlIlIlI;

    public Illll IllIlI();

    /*
     * Enabled aggressive block sorting
     */
    public static List<Illll> IlIllII(Illll illll, boolean bl, boolean bl2, boolean bl3) {
        Illll illll2 = illll == null ? Illll.II : illll;
        ArrayList<Illll> arrayList = new ArrayList<Illll>(3);
        arrayList.add(illll2);
        IIlllllIl.IlIlllI(arrayList, Illll.ll, bl);
        IIlllllIl.IlIlllI(arrayList, Illll.II, bl2);
        IIlllllIl.IlIlllI(arrayList, Illll.I, bl3);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Vec3d IlIllIl(LivingEntity livingEntity, Illll illll) {
        if (livingEntity == null) {
            return null;
        }
        Box box = livingEntity.getBoundingBox();
        Vec3d vec3d = box.getCenter();
        Illll illll2 = illll == null ? Illll.II : illll;
        double d = box.maxY - box.minY;
        double d2 = box.minY + d * illll2.I();
        return new Vec3d(vec3d.x, d2, vec3d.z);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block11: {
            var0 = 16953;
            var1_1 = "\udf42\udc2c\udf6a\udc3e\udf04\udf45\udf39\udc07\udc0a\udf65\udf18\udf93\ub237\ub248\ub25e\ub319\ub341\ub244\ub23c\ub304\ub276\ub232\ub230\ub241\ub22f\ub24d\ub254\ub24a\ub249\ub244\ub21b\ub27c\u4382\u43fd\u43eb\u4228\u4270\u43f5\u438d\u4239\u43c3\u4207\u4381\u43f0\u4398\u43a9\u4239\u4225\u4391\u43df\u4250\u43d1\u53d3\u536c\u5342\u5375\u53fd\u53a8\u53d0\u5360\u539a\u5356\u532c\u535d\u5316\u5371\u53b8\u5372\u531c\u535a\u533f\u5358";
            var2_2 = "\u4235\u422d\u422d\u422d".toCharArray();
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            break block11;
lbl7:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
lbl10:
        // 2 sources

        while (true) {
            var4_4 = 0;
            var5_5 = 0;
            var6_6 = 0;
            if (var7_7 != 0) ** GOTO lbl23
            IIlllllIl.IlIlIIl = var3_3;
            IIlllllIl.IlIlIlI = new Object[var3_3.length];
            IIlllllIl.IlllllI = StringFactory.IIII("Aim Part");
            ** continue;
            break;
        }
        while (true) {
            block12: {
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 >= var2_2.length) break block12;
lbl23:
                // 2 sources

                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
                if (true) ** GOTO lbl35
            }
            var7_7 = 0;
            ** continue;
            break;
        }
        block10: while (true) {
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
            if (var9_9 >= var8_8.length) ** continue;
lbl35:
            // 2 sources

            switch (var9_9 % 6) {
                default: {
                    v0 = 61;
                    continue block10;
                }
                case 2: {
                    v0 = 89;
                    continue block10;
                }
                case 3: {
                    v0 = 72;
                    continue block10;
                }
                case 1: {
                    v0 = 90;
                    continue block10;
                }
                case 4: {
                    v0 = 53;
                    continue block10;
                }
                case 5: 
            }
            v0 = 68;
        }
        IIlllllIl.IllllII = StringFactory.IIII("Priority Head");
        IIlllllIl.IllllIl = StringFactory.IIII("Priority Chest");
        IIlllllIl.IlllIll = StringFactory.IIII("Priority Legs");
    }

    public boolean lIIIl(Illll var1);

    private static void IlIlllI(List<Illll> list, Illll illll, boolean bl) {
        block1: {
            if (!bl) break block1;
            if (!list.contains((Object)illll)) {
                list.add(illll);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Box IlIllll(LivingEntity livingEntity, Illll illll) {
        if (livingEntity == null) {
            return null;
        }
        Box box = livingEntity.getBoundingBox();
        Illll illll2 = illll != null ? illll : Illll.II;
        double d = box.maxY - box.minY;
        double d2 = box.minY + d * illll2.Il();
        double d3 = box.minY + d * illll2.lI();
        return new Box(box.minX, d2, box.minZ, box.maxX, Math.max(d2 + 0.01, d3), box.maxZ);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Illll IllIIII(LivingEntity livingEntity, Vec3d vec3d) {
        if (livingEntity == null) return Illll.II;
        if (vec3d == null) {
            return Illll.II;
        }
        Box box = livingEntity.getBoundingBox();
        double d = Math.max(box.maxY - box.minY, 0.01);
        double d2 = MathHelper.clamp((double)((vec3d.y - box.minY) / d), (double)0.0, (double)1.0);
        if (!(d2 >= Illll.ll.Il())) {
            if (!(d2 >= Illll.II.Il())) return Illll.I;
            return Illll.II;
        }
        return Illll.ll;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List<Illll> IllIIIl(boolean bl, boolean bl2, boolean bl3) {
        ArrayList<Illll> arrayList = new ArrayList<Illll>(3);
        IIlllllIl.IlIlllI(arrayList, Illll.ll, bl);
        IIlllllIl.IlIlllI(arrayList, Illll.II, bl2);
        IIlllllIl.IlIlllI(arrayList, Illll.I, bl3);
        if (!arrayList.isEmpty()) return arrayList;
        arrayList.add(Illll.ll);
        arrayList.add(Illll.II);
        arrayList.add(Illll.I);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x40AD;
        char[] cArray = IlIlIIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlIlIlI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlllllIl.IlIlIlI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x45A6;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x4C80;
            n6 ^= 0xF639;
            n6 += 43189;
            n6 ^= 0xC36D;
            n6 += 16536;
            cArray[n5] = (char)((n6 ^= 0x51BE) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

