package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.view.menu.iq;
import androidx.window.extensions.layout.WindowLayoutComponent;
/* loaded from: classes.dex */
public interface j81 {
    public static final a a = a.a;

    /* loaded from: classes.dex */
    public static final class a {
        public static final boolean b = false;
        public static final /* synthetic */ a a = new a();
        public static final String c = go0.b(j81.class).c();
        public static final l80 d = o80.a(C0006a.n);
        public static l81 e = co.a;

        /* renamed from: androidx.appcompat.view.menu.j81$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0006a extends j80 implements iw {
            public static final C0006a n = new C0006a();

            public C0006a() {
                super(0);
            }

            @Override // androidx.appcompat.view.menu.iw
            /* renamed from: a */
            public final e81 d() {
                WindowLayoutComponent g;
                try {
                    ClassLoader classLoader = j81.class.getClassLoader();
                    or0 or0Var = classLoader != null ? new or0(classLoader, new qf(classLoader)) : null;
                    if (or0Var == null || (g = or0Var.g()) == null) {
                        return null;
                    }
                    iq.a aVar = iq.a;
                    c60.d(classLoader, "loader");
                    return aVar.a(g, new qf(classLoader));
                } catch (Throwable unused) {
                    if (a.b) {
                        String unused2 = a.c;
                        return null;
                    }
                    return null;
                }
            }
        }

        public final e81 c() {
            return (e81) d.getValue();
        }

        public final j81 d(Context context) {
            c60.e(context, "context");
            e81 c2 = c();
            if (c2 == null) {
                c2 = androidx.window.layout.adapter.sidecar.b.c.a(context);
            }
            return e.a(new n81(ga1.b, c2));
        }
    }

    xs a(Activity activity);
}
