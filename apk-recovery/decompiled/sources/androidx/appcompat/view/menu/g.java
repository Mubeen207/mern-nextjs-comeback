package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class g extends e70 implements xg, th {
    public final kh o;

    public g(kh khVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            f0((t60) khVar.d(t60.d));
        }
        this.o = khVar.o(this);
    }

    public void H0(Object obj) {
        I(obj);
    }

    public void I0(Throwable th, boolean z) {
    }

    public void J0(Object obj) {
    }

    public final void K0(xh xhVar, Object obj, yw ywVar) {
        xhVar.e(ywVar, obj, this);
    }

    @Override // androidx.appcompat.view.menu.e70
    public String O() {
        return hj.a(this) + " was cancelled";
    }

    @Override // androidx.appcompat.view.menu.xg
    public final kh b() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.e70, androidx.appcompat.view.menu.t60
    public boolean c() {
        return super.c();
    }

    @Override // androidx.appcompat.view.menu.e70
    public final void e0(Throwable th) {
        rh.a(this.o, th);
    }

    @Override // androidx.appcompat.view.menu.th
    public kh l() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.e70
    public String m0() {
        String b = lh.b(this.o);
        if (b == null) {
            return super.m0();
        }
        return '\"' + b + "\":" + super.m0();
    }

    @Override // androidx.appcompat.view.menu.xg
    public final void n(Object obj) {
        Object k0 = k0(rd.d(obj, null, 1, null));
        if (k0 == f70.b) {
            return;
        }
        H0(k0);
    }

    @Override // androidx.appcompat.view.menu.e70
    public final void r0(Object obj) {
        if (!(obj instanceof nd)) {
            J0(obj);
            return;
        }
        nd ndVar = (nd) obj;
        I0(ndVar.a, ndVar.a());
    }
}
