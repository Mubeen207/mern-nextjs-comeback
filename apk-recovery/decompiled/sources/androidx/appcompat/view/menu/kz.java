package androidx.appcompat.view.menu;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class kz extends mf implements iz {
    public mf[] w0 = new mf[4];
    public int x0 = 0;

    @Override // androidx.appcompat.view.menu.iz
    public void a(mf mfVar) {
        if (mfVar == this || mfVar == null) {
            return;
        }
        int i = this.x0 + 1;
        mf[] mfVarArr = this.w0;
        if (i > mfVarArr.length) {
            this.w0 = (mf[]) Arrays.copyOf(mfVarArr, mfVarArr.length * 2);
        }
        mf[] mfVarArr2 = this.w0;
        int i2 = this.x0;
        mfVarArr2[i2] = mfVar;
        this.x0 = i2 + 1;
    }

    @Override // androidx.appcompat.view.menu.iz
    public void b() {
        this.x0 = 0;
        Arrays.fill(this.w0, (Object) null);
    }

    public void c(nf nfVar) {
    }
}
