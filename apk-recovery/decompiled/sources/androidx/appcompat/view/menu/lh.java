package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public abstract class lh {

    /* loaded from: classes.dex */
    public static final class a extends j80 implements yw {
        public static final a n = new a();

        public a() {
            super(2);
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: a */
        public final kh h(kh khVar, kh.b bVar) {
            return khVar.o(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements yw {
        public final /* synthetic */ eo0 n;
        public final /* synthetic */ boolean o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eo0 eo0Var, boolean z) {
            super(2);
            this.n = eo0Var;
            this.o = z;
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: a */
        public final kh h(kh khVar, kh.b bVar) {
            return khVar.o(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j80 implements yw {
        public static final c n = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z, kh.b bVar) {
            return Boolean.valueOf(z);
        }

        @Override // androidx.appcompat.view.menu.yw
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (kh.b) obj2);
        }
    }

    public static final kh a(kh khVar, kh khVar2, boolean z) {
        boolean c2 = c(khVar);
        boolean c3 = c(khVar2);
        if (c2 || c3) {
            eo0 eo0Var = new eo0();
            eo0Var.m = khVar2;
            bo boVar = bo.m;
            kh khVar3 = (kh) khVar.p(boVar, new b(eo0Var, z));
            if (c3) {
                eo0Var.m = ((kh) eo0Var.m).p(boVar, a.n);
            }
            return khVar3.o((kh) eo0Var.m);
        }
        return khVar.o(khVar2);
    }

    public static final String b(kh khVar) {
        return null;
    }

    public static final boolean c(kh khVar) {
        return ((Boolean) khVar.p(Boolean.FALSE, c.n)).booleanValue();
    }

    public static final kh d(th thVar, kh khVar) {
        kh a2 = a(thVar.l(), khVar, true);
        return (a2 == fm.a() || a2.d(ah.b) != null) ? a2 : a2.o(fm.a());
    }

    public static final p31 e(wh whVar) {
        do {
            whVar = whVar.g();
        } while (whVar != null);
        return null;
    }

    public static final p31 f(xg xgVar, kh khVar, Object obj) {
        if ((xgVar instanceof wh) && khVar.d(r31.m) != null) {
            e((wh) xgVar);
        }
        return null;
    }
}
