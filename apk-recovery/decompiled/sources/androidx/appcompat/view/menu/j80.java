package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class j80 implements ix, Serializable {
    public final int m;

    public j80(int i) {
        this.m = i;
    }

    @Override // androidx.appcompat.view.menu.ix
    public int e() {
        return this.m;
    }

    public String toString() {
        String f = go0.f(this);
        c60.d(f, "renderLambdaToString(this)");
        return f;
    }
}
