package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class h5 implements bf {
    public static final bf a = new h5();

    /* loaded from: classes.dex */
    public static final class a implements wf0 {
        public static final a a = new a();
        public static final nr b = nr.d("sdkVersion");
        public static final nr c = nr.d("model");
        public static final nr d = nr.d("hardware");
        public static final nr e = nr.d("device");
        public static final nr f = nr.d("product");
        public static final nr g = nr.d("osBuild");
        public static final nr h = nr.d("manufacturer");
        public static final nr i = nr.d("fingerprint");
        public static final nr j = nr.d("locale");
        public static final nr k = nr.d("country");
        public static final nr l = nr.d("mccMnc");
        public static final nr m = nr.d("applicationBuild");

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(c2 c2Var, xf0 xf0Var) {
            xf0Var.e(b, c2Var.m());
            xf0Var.e(c, c2Var.j());
            xf0Var.e(d, c2Var.f());
            xf0Var.e(e, c2Var.d());
            xf0Var.e(f, c2Var.l());
            xf0Var.e(g, c2Var.k());
            xf0Var.e(h, c2Var.h());
            xf0Var.e(i, c2Var.e());
            xf0Var.e(j, c2Var.g());
            xf0Var.e(k, c2Var.c());
            xf0Var.e(l, c2Var.i());
            xf0Var.e(m, c2Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements wf0 {
        public static final b a = new b();
        public static final nr b = nr.d("logRequest");

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(g8 g8Var, xf0 xf0Var) {
            xf0Var.e(b, g8Var.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements wf0 {
        public static final c a = new c();
        public static final nr b = nr.d("clientType");
        public static final nr c = nr.d("androidClientInfo");

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(yb ybVar, xf0 xf0Var) {
            xf0Var.e(b, ybVar.c());
            xf0Var.e(c, ybVar.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements wf0 {
        public static final d a = new d();
        public static final nr b = nr.d("eventTimeMs");
        public static final nr c = nr.d("eventCode");
        public static final nr d = nr.d("eventUptimeMs");
        public static final nr e = nr.d("sourceExtension");
        public static final nr f = nr.d("sourceExtensionJsonProto3");
        public static final nr g = nr.d("timezoneOffsetSeconds");
        public static final nr h = nr.d("networkConnectionInfo");

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(ia0 ia0Var, xf0 xf0Var) {
            xf0Var.b(b, ia0Var.c());
            xf0Var.e(c, ia0Var.b());
            xf0Var.b(d, ia0Var.d());
            xf0Var.e(e, ia0Var.f());
            xf0Var.e(f, ia0Var.g());
            xf0Var.b(g, ia0Var.h());
            xf0Var.e(h, ia0Var.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements wf0 {
        public static final e a = new e();
        public static final nr b = nr.d("requestTimeMs");
        public static final nr c = nr.d("requestUptimeMs");
        public static final nr d = nr.d("clientInfo");
        public static final nr e = nr.d("logSource");
        public static final nr f = nr.d("logSourceName");
        public static final nr g = nr.d("logEvent");
        public static final nr h = nr.d("qosTier");

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(ka0 ka0Var, xf0 xf0Var) {
            xf0Var.b(b, ka0Var.g());
            xf0Var.b(c, ka0Var.h());
            xf0Var.e(d, ka0Var.b());
            xf0Var.e(e, ka0Var.d());
            xf0Var.e(f, ka0Var.e());
            xf0Var.e(g, ka0Var.c());
            xf0Var.e(h, ka0Var.f());
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements wf0 {
        public static final f a = new f();
        public static final nr b = nr.d("networkType");
        public static final nr c = nr.d("mobileSubtype");

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(ye0 ye0Var, xf0 xf0Var) {
            xf0Var.e(b, ye0Var.c());
            xf0Var.e(c, ye0Var.b());
        }
    }

    @Override // androidx.appcompat.view.menu.bf
    public void a(ko koVar) {
        b bVar = b.a;
        koVar.a(g8.class, bVar);
        koVar.a(p5.class, bVar);
        e eVar = e.a;
        koVar.a(ka0.class, eVar);
        koVar.a(a6.class, eVar);
        c cVar = c.a;
        koVar.a(yb.class, cVar);
        koVar.a(q5.class, cVar);
        a aVar = a.a;
        koVar.a(c2.class, aVar);
        koVar.a(m5.class, aVar);
        d dVar = d.a;
        koVar.a(ia0.class, dVar);
        koVar.a(z5.class, dVar);
        f fVar = f.a;
        koVar.a(ye0.class, fVar);
        koVar.a(c6.class, fVar);
    }
}
