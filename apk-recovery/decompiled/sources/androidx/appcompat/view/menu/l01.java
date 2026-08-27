package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public abstract class l01 {
    public static final py0 a = new py0("NO_THREAD_ELEMENTS");
    public static final yw b = a.n;
    public static final yw c = b.n;
    public static final yw d = c.n;

    /* loaded from: classes.dex */
    public static final class a extends j80 implements yw {
        public static final a n = new a();

        public a() {
            super(2);
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: a */
        public final Object h(Object obj, kh.b bVar) {
            if (bVar instanceof k01) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements yw {
        public static final b n = new b();

        public b() {
            super(2);
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: a */
        public final k01 h(k01 k01Var, kh.b bVar) {
            if (k01Var != null) {
                return k01Var;
            }
            if (bVar instanceof k01) {
                return (k01) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j80 implements yw {
        public static final c n = new c();

        public c() {
            super(2);
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: a */
        public final r01 h(r01 r01Var, kh.b bVar) {
            if (bVar instanceof k01) {
                k01 k01Var = (k01) bVar;
                r01Var.a(k01Var, k01Var.C(r01Var.a));
            }
            return r01Var;
        }
    }

    public static final void a(kh khVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof r01) {
            ((r01) obj).b(khVar);
            return;
        }
        Object p = khVar.p(null, c);
        c60.c(p, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((k01) p).m(khVar, obj);
    }

    public static final Object b(kh khVar) {
        Object p = khVar.p(0, b);
        c60.b(p);
        return p;
    }

    public static final Object c(kh khVar, Object obj) {
        if (obj == null) {
            obj = b(khVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return khVar.p(new r01(khVar, ((Number) obj).intValue()), d);
        }
        c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((k01) obj).C(khVar);
    }
}
