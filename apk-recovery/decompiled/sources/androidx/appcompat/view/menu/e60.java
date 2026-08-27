package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class e60 {

    /* loaded from: classes.dex */
    public static final class a extends op0 {
        public int n;
        public final /* synthetic */ yw o;
        public final /* synthetic */ Object p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xg xgVar, yw ywVar, Object obj) {
            super(xgVar);
            this.o = ywVar;
            this.p = obj;
            c60.c(xgVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // androidx.appcompat.view.menu.y7
        public Object k(Object obj) {
            int i = this.n;
            if (i == 0) {
                this.n = 1;
                rp0.b(obj);
                c60.c(this.o, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((yw) t21.a(this.o, 2)).h(this.p, this);
            } else if (i == 1) {
                this.n = 2;
                rp0.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends zg {
        public int p;
        public final /* synthetic */ yw q;
        public final /* synthetic */ Object r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xg xgVar, kh khVar, yw ywVar, Object obj) {
            super(xgVar, khVar);
            this.q = ywVar;
            this.r = obj;
            c60.c(xgVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // androidx.appcompat.view.menu.y7
        public Object k(Object obj) {
            int i = this.p;
            if (i == 0) {
                this.p = 1;
                rp0.b(obj);
                c60.c(this.q, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((yw) t21.a(this.q, 2)).h(this.r, this);
            } else if (i == 1) {
                this.p = 2;
                rp0.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static xg a(yw ywVar, Object obj, xg xgVar) {
        c60.e(ywVar, "<this>");
        c60.e(xgVar, "completion");
        xg a2 = gj.a(xgVar);
        if (ywVar instanceof y7) {
            return ((y7) ywVar).a(obj, a2);
        }
        kh b2 = a2.b();
        return b2 == bo.m ? new a(a2, ywVar, obj) : new b(a2, b2, ywVar, obj);
    }

    public static xg b(xg xgVar) {
        xg m;
        c60.e(xgVar, "<this>");
        zg zgVar = xgVar instanceof zg ? (zg) xgVar : null;
        return (zgVar == null || (m = zgVar.m()) == null) ? xgVar : m;
    }
}
