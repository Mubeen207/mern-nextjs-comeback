package androidx.appcompat.view.menu;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a81 extends mf {
    public ArrayList w0 = new ArrayList();

    public abstract void K0();

    public void L0(mf mfVar) {
        this.w0.remove(mfVar);
        mfVar.w0(null);
    }

    public void M0() {
        this.w0.clear();
    }

    @Override // androidx.appcompat.view.menu.mf
    public void Y() {
        this.w0.clear();
        super.Y();
    }

    public void a(mf mfVar) {
        this.w0.add(mfVar);
        if (mfVar.G() != null) {
            ((a81) mfVar.G()).L0(mfVar);
        }
        mfVar.w0(this);
    }

    @Override // androidx.appcompat.view.menu.mf
    public void a0(i9 i9Var) {
        super.a0(i9Var);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            ((mf) this.w0.get(i)).a0(i9Var);
        }
    }
}
