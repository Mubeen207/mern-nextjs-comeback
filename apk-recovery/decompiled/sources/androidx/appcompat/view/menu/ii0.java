package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ii0 {
    public final nd0 a;
    public h b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x014b A[Catch: JSONException -> 0x003f, TryCatch #1 {JSONException -> 0x003f, blocks: (B:6:0x002b, B:7:0x002f, B:59:0x00df, B:60:0x00e4, B:61:0x00f4, B:62:0x010d, B:63:0x0121, B:65:0x0125, B:69:0x013f, B:71:0x014b, B:72:0x0158, B:67:0x012a, B:73:0x015d, B:74:0x016b, B:82:0x01a1, B:83:0x01af, B:111:0x0241, B:116:0x025d, B:81:0x0198, B:90:0x01d6, B:97:0x01f8, B:102:0x0218, B:109:0x0239, B:114:0x0255, B:119:0x0271, B:9:0x0034, B:14:0x0042, B:17:0x004d, B:20:0x0059, B:23:0x0065, B:26:0x0070, B:29:0x007b, B:32:0x0085, B:35:0x008f, B:38:0x0099, B:41:0x00a3, B:44:0x00ad, B:47:0x00b8, B:50:0x00c3, B:53:0x00ce, B:99:0x0201), top: B:125:0x002b, inners: #0, #3, #7, #11 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0158 A[Catch: JSONException -> 0x003f, TryCatch #1 {JSONException -> 0x003f, blocks: (B:6:0x002b, B:7:0x002f, B:59:0x00df, B:60:0x00e4, B:61:0x00f4, B:62:0x010d, B:63:0x0121, B:65:0x0125, B:69:0x013f, B:71:0x014b, B:72:0x0158, B:67:0x012a, B:73:0x015d, B:74:0x016b, B:82:0x01a1, B:83:0x01af, B:111:0x0241, B:116:0x025d, B:81:0x0198, B:90:0x01d6, B:97:0x01f8, B:102:0x0218, B:109:0x0239, B:114:0x0255, B:119:0x0271, B:9:0x0034, B:14:0x0042, B:17:0x004d, B:20:0x0059, B:23:0x0065, B:26:0x0070, B:29:0x007b, B:32:0x0085, B:35:0x008f, B:38:0x0099, B:41:0x00a3, B:44:0x00ad, B:47:0x00b8, B:50:0x00c3, B:53:0x00ce, B:99:0x0201), top: B:125:0x002b, inners: #0, #3, #7, #11 }] */
        @Override // androidx.appcompat.view.menu.nd0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void C(androidx.appcompat.view.menu.ld0 r6, androidx.appcompat.view.menu.nd0.d r7) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ii0.a.C(androidx.appcompat.view.menu.ld0, androidx.appcompat.view.menu.nd0$d):void");
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[k.values().length];
            c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final String b;

        public c(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        
        public String m;

        d(String str) {
            this.m = str;
        }

        public static d e(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.m.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        PLAIN_TEXT("text/plain");
        
        public String m;

        e(String str) {
            this.m = str;
        }

        public static e e(String str) {
            e[] values;
            for (e eVar : values()) {
                if (eVar.m.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        
        public String m;

        f(String str) {
            this.m = str;
        }

        public static f e(String str) {
            f[] values;
            for (f fVar : values()) {
                if (fVar.m.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        
        public final String m;

        g(String str) {
            this.m = str;
        }

        public static g e(String str) {
            g[] values;
            for (g gVar : values()) {
                String str2 = gVar.m;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();

        void g(boolean z);

        CharSequence h(e eVar);

        void i(List list);

        void j(j jVar);

        void k();

        void l();

        void m(String str);

        void n(i iVar);

        void o(g gVar);

        void p(c cVar);

        void q(int i);

        void r(String str);

        boolean s();

        void t(k kVar);
    }

    /* loaded from: classes.dex */
    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        
        public final String m;

        i(String str) {
            this.m = str;
        }

        public static i e(String str) {
            i[] values;
            for (i iVar : values()) {
                if (iVar.m.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public final Integer a;
        public final d b;
        public final Boolean c;
        public final Integer d;
        public final d e;
        public final Integer f;
        public final Boolean g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.a = num;
            this.b = dVar;
            this.c = bool;
            this.d = num2;
            this.e = dVar2;
            this.f = num3;
            this.g = bool2;
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        
        public String m;

        k(String str) {
            this.m = str;
        }

        public static k e(String str) {
            k[] values;
            for (k kVar : values()) {
                if (kVar.m.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        
        public String m;

        l(String str) {
            this.m = str;
        }

        public static l e(String str) {
            l[] values;
            for (l lVar : values()) {
                if (lVar.m.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public ii0(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/platform", q60.a);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public final c g(JSONObject jSONObject) {
        int i2 = jSONObject.getInt("primaryColor");
        if (i2 != 0) {
            i2 |= -16777216;
        }
        return new c(i2, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            androidx.appcompat.view.menu.ii0$f r4 = androidx.appcompat.view.menu.ii0.f.e(r4)
            int[] r8 = androidx.appcompat.view.menu.ii0.b.a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ii0.h(org.json.JSONArray):int");
    }

    public final j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.e(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.e(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public final k j(String str) {
        int i2 = b.c[k.e(str).ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    public final List k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = b.b[l.e(jSONArray.getString(i2)).ordinal()];
            if (i3 == 1) {
                arrayList.add(l.TOP_OVERLAYS);
            } else if (i3 == 2) {
                arrayList.add(l.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.b = hVar;
    }

    public void m(boolean z) {
        ha0.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z)));
    }
}
