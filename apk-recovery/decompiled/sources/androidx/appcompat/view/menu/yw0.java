package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class yw0 extends s implements ne0, xs, lx {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(yw0.class, Object.class, "_state");
    private volatile Object _state;
    public int d;

    /* loaded from: classes.dex */
    public static final class a extends zg {
        public Object p;
        public Object q;
        public Object r;
        public Object s;
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public a(xg xgVar) {
            super(xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return yw0.this.b(null, this);
        }
    }

    public yw0(Object obj) {
        this._state = obj;
    }

    @Override // androidx.appcompat.view.menu.ys
    public Object a(Object obj, xg xgVar) {
        setValue(obj);
        return u31.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:29:0x008f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:29:0x008f). Please submit an issue!!! */
    @Override // androidx.appcompat.view.menu.xs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(androidx.appcompat.view.menu.ys r11, androidx.appcompat.view.menu.xg r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.yw0.b(androidx.appcompat.view.menu.ys, androidx.appcompat.view.menu.xg):java.lang.Object");
    }

    @Override // androidx.appcompat.view.menu.lx
    public xs c(kh khVar, int i, u8 u8Var) {
        return zw0.d(this, khVar, i, u8Var);
    }

    @Override // androidx.appcompat.view.menu.s
    /* renamed from: i */
    public ax0 e() {
        return new ax0();
    }

    @Override // androidx.appcompat.view.menu.s
    /* renamed from: j */
    public ax0[] f(int i) {
        return new ax0[i];
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        u[] h;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !c60.a(obj3, obj)) {
                return false;
            }
            if (c60.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.d = i3;
            u[] h2 = h();
            u31 u31Var = u31.a;
            while (true) {
                ax0[] ax0VarArr = (ax0[]) h2;
                if (ax0VarArr != null) {
                    for (ax0 ax0Var : ax0VarArr) {
                        if (ax0Var != null) {
                            ax0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return true;
                    }
                    h = h();
                    u31 u31Var2 = u31.a;
                }
                h2 = h;
                i3 = i;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ne0
    public void setValue(Object obj) {
        if (obj == null) {
            obj = rf0.a;
        }
        k(null, obj);
    }
}
