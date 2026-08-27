package androidx.appcompat.view.menu;

import android.app.Activity;
/* loaded from: classes.dex */
public interface fa1 {
    public static final a a = a.a;

    /* loaded from: classes.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static kw b = C0004a.n;

        /* renamed from: androidx.appcompat.view.menu.fa1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0004a extends j80 implements kw {
            public static final C0004a n = new C0004a();

            public C0004a() {
                super(1);
            }

            @Override // androidx.appcompat.view.menu.kw
            /* renamed from: a */
            public final fa1 i(fa1 fa1Var) {
                c60.e(fa1Var, "it");
                return fa1Var;
            }
        }

        public final fa1 a() {
            return (fa1) b.i(ga1.b);
        }
    }

    static fa1 b() {
        return a.a();
    }

    ea1 a(Activity activity);
}
