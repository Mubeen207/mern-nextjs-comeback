package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class py extends b81 {
    public py(mf mfVar) {
        super(mfVar);
        mfVar.e.f();
        mfVar.f.f();
        this.f = ((oy) mfVar).K0();
    }

    @Override // androidx.appcompat.view.menu.b81, androidx.appcompat.view.menu.jl
    public void a(jl jlVar) {
        nl nlVar = this.h;
        if (nlVar.c && !nlVar.j) {
            this.h.d((int) ((((nl) nlVar.l.get(0)).g * ((oy) this.b).N0()) + 0.5f));
        }
    }

    @Override // androidx.appcompat.view.menu.b81
    public void d() {
        oy oyVar = (oy) this.b;
        int L0 = oyVar.L0();
        int M0 = oyVar.M0();
        oyVar.N0();
        if (oyVar.K0() == 1) {
            if (L0 != -1) {
                this.h.l.add(this.b.N.e.h);
                this.b.N.e.h.k.add(this.h);
                this.h.f = L0;
            } else if (M0 != -1) {
                this.h.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
                this.h.f = -M0;
            } else {
                nl nlVar = this.h;
                nlVar.b = true;
                nlVar.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (L0 != -1) {
            this.h.l.add(this.b.N.f.h);
            this.b.N.f.h.k.add(this.h);
            this.h.f = L0;
        } else if (M0 != -1) {
            this.h.l.add(this.b.N.f.i);
            this.b.N.f.i.k.add(this.h);
            this.h.f = -M0;
        } else {
            nl nlVar2 = this.h;
            nlVar2.b = true;
            nlVar2.l.add(this.b.N.f.i);
            this.b.N.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // androidx.appcompat.view.menu.b81
    public void e() {
        if (((oy) this.b).K0() == 1) {
            this.b.F0(this.h.g);
        } else {
            this.b.G0(this.h.g);
        }
    }

    @Override // androidx.appcompat.view.menu.b81
    public void f() {
        this.h.c();
    }

    @Override // androidx.appcompat.view.menu.b81
    public boolean m() {
        return false;
    }

    public final void q(nl nlVar) {
        this.h.k.add(nlVar);
        nlVar.l.add(this.h);
    }
}
