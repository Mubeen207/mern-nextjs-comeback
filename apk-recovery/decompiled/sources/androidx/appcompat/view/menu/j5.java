package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class j5 implements bf {
    public static final bf a = new j5();

    /* loaded from: classes.dex */
    public static final class a implements wf0 {
        public static final a a = new a();
        public static final nr b = nr.a("projectNumber").b(b5.b().c(1).a()).a();
        public static final nr c = nr.a("messageId").b(b5.b().c(2).a()).a();
        public static final nr d = nr.a("instanceId").b(b5.b().c(3).a()).a();
        public static final nr e = nr.a("messageType").b(b5.b().c(4).a()).a();
        public static final nr f = nr.a("sdkPlatform").b(b5.b().c(5).a()).a();
        public static final nr g = nr.a("packageName").b(b5.b().c(6).a()).a();
        public static final nr h = nr.a("collapseKey").b(b5.b().c(7).a()).a();
        public static final nr i = nr.a("priority").b(b5.b().c(8).a()).a();
        public static final nr j = nr.a("ttl").b(b5.b().c(9).a()).a();
        public static final nr k = nr.a("topic").b(b5.b().c(10).a()).a();
        public static final nr l = nr.a("bulkId").b(b5.b().c(11).a()).a();
        public static final nr m = nr.a("event").b(b5.b().c(12).a()).a();
        public static final nr n = nr.a("analyticsLabel").b(b5.b().c(13).a()).a();
        public static final nr o = nr.a("campaignId").b(b5.b().c(14).a()).a();
        public static final nr p = nr.a("composerLabel").b(b5.b().c(15).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(dd0 dd0Var, xf0 xf0Var) {
            xf0Var.b(b, dd0Var.l());
            xf0Var.e(c, dd0Var.h());
            xf0Var.e(d, dd0Var.g());
            xf0Var.e(e, dd0Var.i());
            xf0Var.e(f, dd0Var.m());
            xf0Var.e(g, dd0Var.j());
            xf0Var.e(h, dd0Var.d());
            xf0Var.a(i, dd0Var.k());
            xf0Var.a(j, dd0Var.o());
            xf0Var.e(k, dd0Var.n());
            xf0Var.b(l, dd0Var.b());
            xf0Var.e(m, dd0Var.f());
            xf0Var.e(n, dd0Var.a());
            xf0Var.b(o, dd0Var.c());
            xf0Var.e(p, dd0Var.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements wf0 {
        public static final b a = new b();
        public static final nr b = nr.a("messagingClientEvent").b(b5.b().c(1).a()).a();

        @Override // androidx.appcompat.view.menu.wf0
        /* renamed from: b */
        public void a(ed0 ed0Var, xf0 xf0Var) {
            xf0Var.e(b, ed0Var.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements wf0 {
        public static final c a = new c();
        public static final nr b = nr.d("messagingClientEventExtension");

        @Override // androidx.appcompat.view.menu.wf0
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            my0.a(obj);
            b(null, (xf0) obj2);
        }

        public void b(xk0 xk0Var, xf0 xf0Var) {
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.bf
    public void a(ko koVar) {
        koVar.a(xk0.class, c.a);
        koVar.a(ed0.class, b.a);
        koVar.a(dd0.class, a.a);
    }
}
