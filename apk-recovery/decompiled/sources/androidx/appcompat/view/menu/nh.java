package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ah;
import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public abstract class nh extends h implements ah {
    public static final a n = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: androidx.appcompat.view.menu.nh$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0019a extends j80 implements kw {
            public static final C0019a n = new C0019a();

            public C0019a() {
                super(1);
            }

            @Override // androidx.appcompat.view.menu.kw
            /* renamed from: a */
            public final nh i(kh.b bVar) {
                if (bVar instanceof nh) {
                    return (nh) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public a() {
            super(ah.b, C0019a.n);
        }
    }

    public nh() {
        super(ah.b);
    }

    public abstract void A(kh khVar, Runnable runnable);

    public boolean D(kh khVar) {
        return true;
    }

    public nh E(int i) {
        h90.a(i);
        return new g90(this, i);
    }

    @Override // androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.kh.b, androidx.appcompat.view.menu.kh
    public kh.b d(kh.c cVar) {
        return ah.a.a(this, cVar);
    }

    @Override // androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.kh
    public kh j(kh.c cVar) {
        return ah.a.b(this, cVar);
    }

    public String toString() {
        return hj.a(this) + '@' + hj.b(this);
    }

    @Override // androidx.appcompat.view.menu.ah
    public final void x(xg xgVar) {
        c60.c(xgVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((bm) xgVar).q();
    }

    @Override // androidx.appcompat.view.menu.ah
    public final xg z(xg xgVar) {
        return new bm(this, xgVar);
    }
}
