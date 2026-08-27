package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class i5 implements bf {
    public static final bf a = new i5();

    /* loaded from: classes.dex */
    public static final class a implements wf0 {
        public static final a a = new a();
        public static final nr b = nr.a("window").b(b5.b().c(1).a()).a();
        public static final nr c = nr.a("logSourceMetrics").b(b5.b().c(2).a()).a();
        public static final nr d = nr.a("globalMetrics").b(b5.b().c(3).a()).a();
        public static final nr e = nr.a("appNamespace").b(b5.b().c(4).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(zb zbVar, xf0 xf0Var) {
            xf0Var.e(b, zbVar.d());
            xf0Var.e(c, zbVar.c());
            xf0Var.e(d, zbVar.b());
            xf0Var.e(e, zbVar.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements wf0 {
        public static final b a = new b();
        public static final nr b = nr.a("storageMetrics").b(b5.b().c(1).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(tx txVar, xf0 xf0Var) {
            xf0Var.e(b, txVar.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements wf0 {
        public static final c a = new c();
        public static final nr b = nr.a("eventsDroppedCount").b(b5.b().c(1).a()).a();
        public static final nr c = nr.a("reason").b(b5.b().c(3).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(ja0 ja0Var, xf0 xf0Var) {
            xf0Var.b(b, ja0Var.a());
            xf0Var.e(c, ja0Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements wf0 {
        public static final d a = new d();
        public static final nr b = nr.a("logSource").b(b5.b().c(1).a()).a();
        public static final nr c = nr.a("logEventDropped").b(b5.b().c(2).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(ma0 ma0Var, xf0 xf0Var) {
            xf0Var.e(b, ma0Var.b());
            xf0Var.e(c, ma0Var.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements wf0 {
        public static final e a = new e();
        public static final nr b = nr.d("clientMetrics");

        @Override // androidx.appcompat.view.menu.wf0
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            my0.a(obj);
            b(null, (xf0) obj2);
        }

        public void b(yk0 yk0Var, xf0 xf0Var) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements wf0 {
        public static final f a = new f();
        public static final nr b = nr.a("currentCacheSizeBytes").b(b5.b().c(1).a()).a();
        public static final nr c = nr.a("maxCacheSizeBytes").b(b5.b().c(2).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(hx0 hx0Var, xf0 xf0Var) {
            xf0Var.b(b, hx0Var.a());
            xf0Var.b(c, hx0Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements wf0 {
        public static final g a = new g();
        public static final nr b = nr.a("startMs").b(b5.b().c(1).a()).a();
        public static final nr c = nr.a("endMs").b(b5.b().c(2).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(x01 x01Var, xf0 xf0Var) {
            xf0Var.b(b, x01Var.b());
            xf0Var.b(c, x01Var.a());
        }
    }

    @Override // androidx.appcompat.view.menu.bf
    public void a(ko koVar) {
        koVar.a(yk0.class, e.a);
        koVar.a(zb.class, a.a);
        koVar.a(x01.class, g.a);
        koVar.a(ma0.class, d.a);
        koVar.a(ja0.class, c.a);
        koVar.a(tx.class, b.a);
        koVar.a(hx0.class, f.a);
    }
}
