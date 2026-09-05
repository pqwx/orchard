/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Failed to inspect Fake Client badge texture '{}'
 *   - Failed to load fallback Fake Client badge '{}'
 *   - Failed to scan Fake Client badge root '{}'
 *   - feather_badges/developer.png
 *   - lunar_badges/lunar-admin.png
 *   - lunar_badges/lunar-agent.png
 *   - lunar_badges/lunar-gecko.png
 *   - lunar_badges/lunar-owner.png
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.client.texture.NativeImage
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package orchard.internal;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.texture.NativeImage;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIlIlIIll;
import orchard.internal.IIlllIIII;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class llllIl {
    private static final IIIlIIIII I;
    private static final IIIlIIIII l;
    private static final Logger II;
    private static final IIIlIIIII Il;
    private static final float lI = 6.0f;
    private static final IIIlIIIII ll;
    private static final IIIlIIIII III;
    private static volatile WeakReference<IIlIlIIll> IIl;
    private static final float IlI = 8.0f;
    private static final IIIlIIIII Ill;
    private static final IIIlIIIII lII;
    private static final int[] lIl;
    private static final String[] llI;
    private static final Object[] lll;

    /*
     * Enabled aggressive exception aggregation
     */
    private static Optional<IIlllIIII> I(Path path, Path path2) {
        String string = path.relativize(path2).toString().replace('\\', '/');
        if (string.equalsIgnoreCase("feather/feather_icon.png")) {
            return Optional.empty();
        }
        try (InputStream inputStream = Files.newInputStream(path2, new OpenOption[0]);){
            Optional<IIlllIIII> optional;
            block19: {
                NativeImage nativeImage;
                block17: {
                    Optional<IIlllIIII> optional2;
                    block18: {
                        nativeImage = NativeImage.read((InputStream)inputStream);
                        try {
                            if (nativeImage != null && nativeImage.getWidth() > 0 && nativeImage.getHeight() > 0) break block17;
                            optional2 = Optional.empty();
                            if (nativeImage == null) break block18;
                        }
                        catch (Throwable throwable) {
                            if (nativeImage != null) {
                                try {
                                    nativeImage.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        nativeImage.close();
                    }
                    return optional2;
                }
                String string2 = string.substring(0, string.length() - 4);
                float f = llllIl.l(nativeImage.getWidth(), nativeImage.getHeight(), 8.0f);
                float f2 = llllIl.l(nativeImage.getWidth(), nativeImage.getHeight(), 6.0f);
                optional = Optional.of(new IIlllIIII(string2, llllIl.IIl(string2), lII.llIl(StringFactory.lIl(string)), nativeImage.getWidth(), nativeImage.getHeight(), f, 8.0f, f2, 6.0f));
                if (nativeImage == null) break block19;
                nativeImage.close();
            }
            return optional;
        }
        catch (Exception exception) {
            II.warn("Failed to inspect Fake Client badge texture '{}'", (Object)path2, (Object)exception);
            return Optional.empty();
        }
    }

    private static float l(int n, int n2, float f) {
        return f * ((float)n / (float)n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IIlIlIIll II() {
        Object object2;
        LinkedHashSet<Path> linkedHashSet = new LinkedHashSet<Path>();
        llllIl.Ill(linkedHashSet, Paths.get("fabric-apple-client", "src", "client", "resources", ll.IIII()));
        llllIl.Ill(linkedHashSet, Paths.get("src", "client", "resources", ll.IIII()));
        FabricLoader.getInstance().getModContainer(StringFactory.IIl("kZhbihpWRA8=")).ifPresent(modContainer -> modContainer.findPath(ll.IIII()).ifPresent(path -> llllIl.Ill(linkedHashSet, path)));
        ArrayList<IIlllIIII> arrayList = new ArrayList<IIlllIIII>();
        for (Object object2 : linkedHashSet) {
            arrayList.addAll(llllIl.llI((Path)object2));
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(llllIl.Il());
        }
        arrayList.sort(Comparator.comparing(IIlllIIII::lll, String.CASE_INSENSITIVE_ORDER));
        Object object3 = null;
        object2 = new LinkedHashMap();
        ArrayList<IIlllIIII> arrayList2 = new ArrayList<IIlllIIII>(arrayList.size());
        LinkedHashMap<Long, IIlllIIII> linkedHashMap = new LinkedHashMap<Long, IIlllIIII>();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            IIlllIIII iIlllIIII;
            IIlllIIII iIlllIIII2 = (IIlllIIII)iterator.next();
            int n = object2.merge(iIlllIIII2.lll(), 1, Integer::sum);
            if (n <= 1) {
                iIlllIIII = iIlllIIII2;
            } else {
                String string = ")";
                int n2 = n;
                String string2 = " (#";
                String string3 = iIlllIIII2.lll();
                iIlllIIII = iIlllIIII2.I(string3 + string2 + n2 + string);
            }
            IIlllIIII iIlllIIII3 = iIlllIIII;
            arrayList2.add(iIlllIIII3);
            linkedHashMap.put(iIlllIIII3.ll(), iIlllIIII3);
            if (object3 != null) continue;
            object3 = iIlllIIII3;
        }
        return new IIlIlIIll(List.copyOf(arrayList2), Map.copyOf(linkedHashMap), (IIlllIIII)object3);
    }

    private static List<IIlllIIII> Il() {
        ArrayList<IIlllIIII> arrayList = new ArrayList<IIlllIIII>();
        List<IIIlIIIII> list = List.of(StringFactory.IIII("feather_badges/admin.png"), StringFactory.IIII("feather_badges/creator.png"), StringFactory.IIII("feather_badges/developer.png"), StringFactory.IIII("feather_badges/owner.png"), StringFactory.IIII("feather_badges/partner.png"), StringFactory.IIII("feather_badges/pro.png"), StringFactory.IIII("feather_badges/staff.png"), StringFactory.IIII("feather_badges/user.png"), StringFactory.IIII("lunar_badges/lunar-admin.png"), StringFactory.IIII("lunar_badges/lunar-agent.png"), StringFactory.IIII("lunar_badges/lunar-dev.png"), StringFactory.IIII("lunar_badges/lunar-gecko.png"), StringFactory.IIII("lunar_badges/lunar-owner.png"), StringFactory.IIII("lunar_badges/lunar-partner.png"), StringFactory.IIII("lunar_badges/lunar-phase.png"), StringFactory.IIII("lunar_badges/lunar-plain.png"), StringFactory.IIII("lunar_badges/lunar-staff.png"), StringFactory.IIII("lunar_badges/lunar-tester.png"), StringFactory.IIII("lunar_badges/plus.png"));
        for (IIIlIIIII iIIlIIIII : list) {
            String string;
            String string2 = string = iIIlIIIII.IIII();
            String string3 = "/";
            String string4 = ll.IIII();
            String string5 = string4 + string3 + string2;
            try {
                InputStream inputStream = llllIl.class.getClassLoader().getResourceAsStream(string5);
                try {
                    if (inputStream == null) continue;
                    NativeImage nativeImage = NativeImage.read((InputStream)inputStream);
                    try {
                        if (nativeImage == null || nativeImage.getWidth() <= 0 || nativeImage.getHeight() <= 0) continue;
                        String string6 = string.substring(0, string.length() - 4);
                        arrayList.add(new IIlllIIII(string6, llllIl.IIl(string6), lII.llIl(StringFactory.lIl(string)), nativeImage.getWidth(), nativeImage.getHeight(), llllIl.l(nativeImage.getWidth(), nativeImage.getHeight(), 8.0f), 8.0f, llllIl.l(nativeImage.getWidth(), nativeImage.getHeight(), 6.0f), 6.0f));
                    }
                    finally {
                        if (nativeImage == null) continue;
                        nativeImage.close();
                    }
                }
                finally {
                    if (inputStream == null) continue;
                    inputStream.close();
                }
            }
            catch (Exception exception) {
                II.warn("Failed to load fallback Fake Client badge '{}'", (Object)string, (Object)exception);
            }
        }
        return arrayList;
    }

    public static List<String> lI() {
        return llllIl.IIlI().l();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21566;
        String string = "\u5e5b\u5e99\u5e44\u5ecf\u5e06\u5e62\u5eb6\u5e5f\u5e5d\u5e3e\u5e5e\u5efa\u5eb3\u5e9c\u5e62\u5e07\u5eb5\u5ec2\u5e17\u5e18\u5e68\u5e8b\u5e74\u5ed5\u5e43\u5e4b\u5e8d\u5e60\u5e53\u5e20\u5ead\u5e01\u04bc\u0466\u04ab\u0402\u04fb\u049d\u0477\u04a7\u04b6\u04ec\u0487\u040e\u045b\u0473\u04f2\u04ee\u0440\u0449\u04da\u04c8\u0496\u0477\u04b6\u0427\u0488\u04f1\u0408\u0494\u04ab\u0486\u0427\u04b3\u04a7\u0461\u04ba\u0407\u04c6\u04a7\u047a\u04a7\u04c0\u04e7\u04c5\u0434\u0463\u0408\u04e0\u04d5\u044c\u0452\u04c0\u04e3\u04bb\u0467\u0485\u0413\u0486\u04e9\u0454\u048e\u0487\u04a3\u0436\u04c6\ufc84\ufc46\ufc8b\ufc11\ufcda\ufc97\ufc6d\ufc86\ufc9b\ufcdf\ufcfc\ufc3f\ufc6f\ufc53\ufcc6\ufcf5\ufc79\ufc50\ufcee\ufcd9\ufcb4\ufc3b\ufcde\ufc33\ufc9a\ufce0\ufc25\ufcda\ud7b6\ud737\ud7b2\ud72b\u8c84\u8c00\u8cb6\u8c21\u8cde\u8cae\u8c48\u8c94\u0db8\u0d7d\u0da0\u0d35\u0de0\u0db3\u0d6c\u0dae\u0dbd\u0dce\u0d98\u0d09\u68d1\u6850\u68d5\u684c\u5fb0\u5f34\u5f82\u5f15\u5fea\u5f9a\u5f7c\u5fa0\ud7b7\ud772\ud7af\ud73a\ud7ef\ud7bc\ud763\ud7a1\ud7b2\ud7c1\ud797\ud706\u7a40\u7aad\u7a74\u7ae5\u7a18\u7a56\u7a9e\u7a45\u7a40\u7a0d\u7a37\u7a8b\u7e34\u7e94\u7e46\u7ef2\u6dd6\u6d6b\u6dec\u6d77\u0f12\u0fd0\u0f0d\u0f86\u0f4f\u0f2b\u0fff\u0f16\u0f14\u0f72\u0f17\u0fb7\u0ffd\u0fd5\u0f6a\u0f65\u0ffd\u0fc1\u0f7f\u0f4e\u0f20\u0fad\u0f03\u0f9e\u0f05\u0f6d\u0fc4\u0f29\u0f1a\u0f69\u0fe4\u0f48\ub076\ub0b4\ub069\ub0e2\ub02b\ub04f\ub09b\ub072\ub070\ub016\ub073\ub0d3\ub099\ub0b1\ub00e\ub001\ub099\ub0a5\ub01b\ub02a\ub044\ub0a5\ub06f\ub0f2\ub06f\ub00a\ub08d\ub042\ub07e\ub06e\ub080\ub003\ub075\ub095\ub017\ub089\u75d1\u7513\u75ce\u7545\u758c\u75e8\u753c\u75d5\u75d7\u75b1\u75d4\u7574\u753e\u7516\u75a9\u75a6\u753e\u7502\u75bc\u758d\u75e0\u752b\u758b\u7544\u75cb\u75ae\u750c\u75e5\u75d9\u75aa\u7546\u75a6\u758d\u7531\u75e1\u7541\u75bd\u75cd\u7547\u75bb\uefaf\uef6d\uefb0\uef3b\ueff2\uef96\uef42\uefab\uefa9\uefcf\uefaa\uef0a\uef40\uef68\uefd7\uefd8\uef40\uef7c\uefc2\ueff3\uef98\uef7c\uefec\uef18\uefb5\uefd3\uef06\uef94\uefa7\uefd4\uef59\ueff5\u2fc9\u2f0b\u2fd6\u2f5d\u2f94\u2ff0\u2f24\u2fcd\u2fcf\u2fa9\u2fcc\u2f6c\u2f26\u2f0e\u2fb1\u2fbe\u2f26\u2f1a\u2fa4\u2f95\u2fff\u2f33\u2fcc\u2f58\u2fd7\u2fa6\u2f1c\u2fc9\u2fc1\u2fd1\u2f3f\u2fbc\u2fca\u2f2a\u2fa8\u2f36\u7163\u71a1\u717c\u71f7\u713e\u715a\u718e\u7167\u7165\u7103\u7166\u71c6\u718c\u71a4\u711b\u7114\u718c\u71b0\u710e\u713f\u7155\u7186\u717a\u71d7\u716b\u7129\u7188\u7158\u716c\u7168\u719c\u7166\u60de\u601c\u60c1\u604a\u6083\u60e7\u6033\u60da\u60d8\u60be\u60db\u607b\u6031\u6019\u60a6\u60a9\u6031\u600d\u60b3\u6082\u60e8\u600d\u60cf\u605e\u60c4\u608b\u6032\u60e5\u60d6\u60a5\u6028\u6084\u4790\u4752\u478f\u4704\u47cd\u47a9\u477d\u4794\u4796\u47f0\u4795\u4735\u477f\u4757\u47e8\u47e7\u477f\u4743\u47fd\u47cc\u47a5\u472e\u478d\u4714\u478d\u47c1\u4745\u47b9\u479d\u478c\u4731\u4795\ue2cd\ue234\ue2d0\ue26c\ue295\ue2e5\ue210\ue2f7\ue2cd\ue2ae\ue2b7\ue268\ue227\ue267\ue2b3\ue296\ue232\ue221\ue2ce\ue28d\ue2f8\ue20f\ue2ca\ue25e\ue2c7\ue2b0\ue263\ue2c8\ue2c2\ue2e9\ue266\ue2a4\ue293\ue22f\ue2ff\ue25f\ue2a3\ue2d3\ue259\ue2a5\u6f77\u6f8e\u6f6a\u6fd6\u6f2f\u6f5f\u6faa\u6f4d\u6f77\u6f14\u6f0d\u6fd2\u6f9d\u6fdd\u6f09\u6f2c\u6f88\u6f9b\u6f74\u6f37\u6f42\u6fb5\u6f70\u6fe4\u6f7d\u6f0a\u6fd9\u6f73\u6f7a\u6f53\u6f83\u6f04\u6f29\u6f95\u6f45\u6fe5\u6f19\u6f69\u6fe3\u6f1f\uefd0\uef29\uefcd\uef71\uef88\ueff8\uef0d\uefea\uefd0\uefb3\uefaa\uef75\uef3a\uef7a\uefae\uef8b\uef2f\uef3c\uefd3\uef90\uefe5\uef12\uefd7\uef43\uefda\uefad\uef29\uefd2\uefd9\uefca\uef24\uefa7\uefd1\uef31\uefb3\uef2d\u6c19\u6ce0\u6c04\u6cb8\u6c41\u6c31\u6cc4\u6c23\u6c19\u6c7a\u6c63\u6cbc\u6cf3\u6cb3\u6c67\u6c42\u6ce6\u6cf5\u6c1a\u6c59\u6c2c\u6cdb\u6c1e\u6c8a\u6c13\u6c64\u6cf4\u6c1b\u6c17\u6c17\u6caa\u6c77\u6c47\u6cfb\u6c2b\u6c8b\u6c77\u6c07\u6c8d\u6c71\u191b\u19e2\u1906\u19ba\u1943\u1933\u19c6\u1921\u191b\u1978\u1961\u19be\u19f1\u19b1\u1965\u1940\u19e4\u19f7\u1918\u195b\u192e\u19d9\u191c\u1988\u1911\u1966\u19c8\u1935\u1914\u1905\u198e\u196e\u1945\u19f9\u1929\u1989\u1975\u1905\u198f\u1973\ue82c\ue8d5\ue831\ue88d\ue874\ue804\ue8f1\ue816\ue82c\ue84f\ue856\ue889\ue8c6\ue886\ue852\ue877\ue8d3\ue8c0\ue82f\ue86c\ue819\ue8ee\ue82b\ue8bf\ue826\ue852\ue8c5\ue814\ue826\ue831\ue8bd\ue845\ue82b\ue8f4\ue805\ue8be\ue849\ue804\ue8cd\ue82c\uceaf\uce56\uceb2\uce0e\ucef7\uce87\uce72\uce95\uceaf\ucecc\uced5\uce0a\uce45\uce05\uced1\ucef4\uce50\uce43\uceac\uceef\uce9a\uce6d\ucea8\uce3c\ucea5\uced1\uce46\uce9c\ucea1\uce8c\uce22\ucecf\ucef1\uce4d\uce9d\uce3d\ucec1\uceb1\uce3b\ucec7\u5adb\u5a22\u5ac6\u5a7a\u5a83\u5af3\u5a06\u5ae1\u5adb\u5ab8\u5aa1\u5a7e\u5a31\u5a71\u5aa5\u5a80\u5a24\u5a37\u5ad8\u5a9b\u5aee\u5a19\u5adc\u5a48\u5ad1\u5aa5\u5a32\u5aec\u5ad5\u5aff\u5a70\u5ab2\u5a85\u5a39\u5ae9\u5a49\u5ab5\u5ac5\u5a4f\u5ab3\u608e\u6077\u6093\u602f\u60d6\u60a6\u6053\u60b4\u608e\u60ed\u60f4\u602b\u6064\u6024\u60f0\u60d5\u6071\u6062\u608d\u60ce\u60bb\u604c\u6089\u601d\u6084\u60f0\u6028\u60a1\u6080\u60aa\u6017\u60d5\u60d0\u606c\u60bc\u601c\u60e0\u6090\u601a\u60e6\u461d\u46e4\u4600\u46bc\u4645\u4635\u46c0\u4627\u461d\u467e\u4667\u46b8\u46f7\u46b7\u4663\u4646\u46e2\u46f1\u461e\u465d\u4628\u46df\u461a\u468e\u4617\u4663\u46e4\u461f\u4617\u4610\u468c\u467d\u4619\u46f8\u4627\u468d\u467d\u4613\u46d3\u4675\u013e\u01c7\u0123\u019f\u0166\u0116\u01e3\u0104\u013e\u015d\u0144\u019b\u01d4\u0194\u0140\u0165\u01c1\u01d1\u0142\u0161\u0109\u0182\u0122\u018b\u0121\u0153\u01e9\u013a\uac41\uacdb\uac7a\uace1\u2ac0\u2a1a\u2ad7\u2a7e\u2a87\u2ae1\u2a0b\u2adb\u2aca\u2a90\u2afb\u2a72\u2a27\u2a0f\u2a9a\u2a9d\u2a30\u2a0c\u2a93\u2ab3\u2ae9\u2a18\u2add\u2a57\u2ac0\u2ab7\u2a70\u2ae2\u2ad4\u2ad4\u2a6e\u2a83\u2ac5\u2a3b\u2aec\u2a4f\u2ab4\u2ae6\u2a5c\u2af8\u2abf\u2aa1\u2af7\u2a4f\u2a19\u2a2e\u2a90\u2aa9\u2a33\u2a49\u2aac\u2a83\u2ac3\u2a67\u2afa\u2a47\u2aa5\u2ab8\u2a0d\u2ae8\u2aee\u2ad3\u2a27\u2add\ud869\ud8ed\ud865\ud8e9\ud834\ud866\ud8fc\ud800\ufaa7\ufa4f\ufa99\ufa2e\ufafd\ufa8e\ufa3e\ufab6\ufabb\ufad5\ufac5\ufa00\ufa40\ufa70\ufadf\ufae1\ufa4f\ufa3d\ufae8\ufaed\ufa91\ufa41\ufafe\ufa35\ufabe\ufad8\ufa01\ufa90\ufaaf\ufaaf\ufa3f\ufad5\ufab2\ufa47\ufa8b\ufa2e\ufad6\ufab8\ufa61\ufaa0\ufac2\ufaf7\ufa9b\ufa39\ufa64\ufa08\ufac1\ufae0\ufa40\ufa42\ufae6\ufaef\ue8b8\ue844\ue8a3\ue833\ue8e1\ue886\ue86f\ue8ad\ue8bd\ue8e4\ue8d9\ue816\ue858\ue819\ue8dc\ue8e0\ue848\ue878\ue8d1\ue8f5\ue8d0\ue86c\ue8e2\ue83c\ue8ab\ue8ac\ue84b\ue8b2\ue8b0\ue8b0\ue809\ue8d2\ue8b9\ue869\ue884\ue832\ue8ce\ue8a0\ue82a\ue8d6\u0fdd\u0f1f\u0fc2\u0f49\u0f80\u0fe4\u0f30\u0fd9\u0fdb\u0fbd\u0fd8\u0f78\u0f32\u0f1a\u0fa5\u0faa\u0f32\u0f0e\u0fb2\u0fee\u99ac\u9955\u99b1\u990d\u99f4\u9984\u9971\u9996\u99ac\u99cf\u99d6\u9909\u9946\u9906\u99d2\u99f7\uc044\uc09e\uc043\uc0c8\uc001\uc065\uc0b1\uc058\uc05a\uc032\uc02b\uc092\u3766\u3787\u3763\u37df\u3726\u3756\u37a4\u3716\u5b8d\u5b68\u5ba9\u5b37\u2f7d\u2fd2\u2f45\u2fde\uc225\uc2a7\uc271\uc2d9\uc223\uc276\uc2ec\uc210\uaf9f\uaf45\uaf88\uaf21\uafd8\uafbe\uaf54\uaf84\uaf95\uafcf\uafa4\uaf2d\uaf78\uaf53\uaff3\uaff4\uaf6f\uaf53\uaf9b\uafec\uafae\uaf47\uaf82\uaf37\uaf9d\uafc6\uaf6c\uafd2\uaf8a\uaffc\uaf2e\uafe5\uaf84\uaf67\uafa4\uaf23\uafe4\uaf8b\uaf1b\uaf88\uafe2\uafd4\uafbb\uaf2d\uaf43\uaf76\uaffe\uafc1\uaf6f\uaf75\uafca\uafd1\uaf99\uaf39\uaf9f\uaf01";
        char[] cArray = "\u541e\u547e\u5422\u543a\u5436\u5432\u543a\u5436\u5432\u5432\u543a\u543a\u541e\u541a\u5416\u541e\u541a\u541e\u541e\u541e\u5416\u5416\u541a\u5416\u5416\u5416\u5416\u5416\u5416\u5416\u5422\u543a\u547e\u5436\u540a\u5416\u542a\u542e\u5432\u5436\u543a\u543a\u5436\u5406".toCharArray();
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
                llI = stringArray;
                lll = new Object[stringArray.length];
                int n6 = -937079994;
                byte[] byArray = "\u0011\u00f9\u00d6\u00de/\u0019q\u0084G+\u0092t\u0098J\u0089\u00e6\u00d9\u00ffN\u00f9n3$D\u00ba\u00c1\u0095\u0017\u0087?\u00ca\u0081\u00bb\u0001\u0001\u00daQ\u0012U\u009b6\u00cd\u00f4G\bI\u009d^'\u0091\u00c4\u00e5~0\u00e7LZ\u00b16\u0094\u00b8\u00ffK\u00b4\u0086\u0091\u0018\u00f2<\u0000r\t\u009e\u00b7\u00eb\u00cds\u00cd\u000b\u00cb_\u0087=\u00c3\u00d3\u00ed\u001f\u00a61\u00ec\"!\u00e5\u0082\u00db\u00c6\u000fr3\u000eO\u00bc\u001c\u008fms\u00c3\u008022f\u00ae".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lIl = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    llllIl.lIl[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                II = LoggerFactory.getLogger(llllIl.class);
                I = StringFactory.IIII("cats");
                ll = StringFactory.IIII("assets/cats/textures/w6t2c8/fake_client");
                lII = StringFactory.IIII("textures/w6t2c8/fake_client/");
                III = StringFactory.IIII("feather_badges");
                Ill = StringFactory.IIII("lunar_badges");
                l = StringFactory.IIII("Feather");
                Il = StringFactory.IIII("Lunar");
                IIl = new WeakReference<Object>(null);
                return;
            }
            n2 = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void ll() {
        Class<llllIl> clazz = llllIl.class;
        synchronized (llllIl.class) {
            IIl.clear();
            IIl = new WeakReference<Object>(null);
            // ** MonitorExit[var0] (shouldn't be in output)
            return;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String III(String string) {
        if (string == null) return "";
        if (string.isBlank()) {
            return "";
        }
        String[] stringArray = string.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= n) return stringBuilder.toString();
            String string2 = stringArray2[n2];
            if (string2.isBlank()) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(' ');
            }
            String string3 = string2.toLowerCase(Locale.ROOT);
            stringBuilder.append(Character.toUpperCase(string3.charAt(0)));
            if (string3.length() <= 1) continue;
            stringBuilder.append(string3.substring(1));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(String string) {
        String string2;
        String string3;
        String string4 = string.replace('\\', '/');
        int n = string4.indexOf(47);
        String string5 = n >= 0 ? string4.substring(0, n) : "";
        String string6 = string3 = n >= 0 ? string4.substring(n + 1) : string4;
        if (!string5.isEmpty()) {
            string2 = III.lII(string5) ? l.IIII() : (Ill.lII(string5) ? Il.IIII() : llllIl.III(string5.replace('/', ' ')));
        }
        string2 = "";
        String string7 = llllIl.III(string3.replace('/', ' ').replace('-', ' ').replace('_', ' '));
        if (!string7.isBlank()) {
            if (string2.isBlank()) {
                return string7;
            }
        } else {
            return string2;
        }
        String string8 = string7;
        String string9 = " ";
        String string10 = string2;
        return string10 + string9 + string8;
    }

    private static void Ill(Set<Path> set, Path path) {
        if (path == null) {
            return;
        }
        try {
            if (Files.isDirectory(path, new LinkOption[0])) {
                set.add(path.toAbsolutePath().normalize());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static IIlllIIII lII(String string) {
        return llllIl.IIlI().lI(string);
    }

    private static List<IIlllIIII> llI(Path path3) {
        ArrayList<IIlllIIII> arrayList = new ArrayList<IIlllIIII>();
        try (Stream<Path> stream = Files.walk(path3, new FileVisitOption[0]);){
            stream.filter(path -> Files.isRegularFile(path, new LinkOption[0])).filter(path -> path.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".png")).forEach(path2 -> llllIl.I(path3, path2).ifPresent(arrayList::add));
        }
        catch (Exception exception) {
            II.warn("Failed to scan Fake Client badge root '{}'", (Object)path3, (Object)exception);
        }
        return arrayList;
    }

    public static IIlllIIII IIIl() {
        return llllIl.IIlI().II();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static IIlIlIIll IIlI() {
        IIlIlIIll iIlIlIIll = (IIlIlIIll)IIl.get();
        if (iIlIlIIll != null) {
            return iIlIlIIll;
        }
        Class<llllIl> clazz = llllIl.class;
        synchronized (llllIl.class) {
            iIlIlIIll = (IIlIlIIll)IIl.get();
            if (iIlIlIIll == null) {
                iIlIlIIll = llllIl.II();
                IIl = new WeakReference<IIlIlIIll>(iIlIlIIll);
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return iIlIlIIll;
        }
    }

    private llllIl() {
    }

    private static int IlII(int n, int n2) {
        return lIl[n ^ 0x40AEDA47] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x903C9621;
        char[] cArray = llI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llllIl.lll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x86789729;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 13 -> 219;
                case 29 -> 12;
                case 5 -> 61;
                case 24 -> 9;
                case 20 -> 26;
                case 4 -> 114;
                case 25 -> 99;
                default -> 40;
                case 10 -> 12;
                case 23 -> 144;
                case 12 -> 234;
                case 3 -> 132;
                case 26 -> 218;
                case 16 -> 234;
                case 1 -> 244;
                case 15 -> 84;
                case 8 -> 17;
                case 18 -> 104;
                case 19 -> 72;
                case 28 -> 28;
                case 27 -> 37;
                case 2 -> 31;
                case 11 -> 181;
                case 30 -> 132;
                case 31 -> 126;
                case 17 -> 230;
                case 14 -> 74;
                case 9 -> 79;
                case 21 -> 204;
                case 7 -> 17;
                case 6 -> 237;
                case 22 -> 46;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

