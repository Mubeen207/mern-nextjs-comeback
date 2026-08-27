package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.appcompat.view.menu.m2;
/* loaded from: classes.dex */
public final class rd1 {
    public final SparseIntArray a = new SparseIntArray();
    public ey b;

    public rd1(ey eyVar) {
        pj0.i(eyVar);
        this.b = eyVar;
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    public final int b(Context context, m2.f fVar) {
        pj0.i(context);
        pj0.i(fVar);
        int i = 0;
        if (fVar.d()) {
            int e = fVar.e();
            int a = a(context, e);
            if (a == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.a.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = this.a.keyAt(i2);
                    if (keyAt > e && this.a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                }
                a = i == -1 ? this.b.h(context, e) : i;
                this.a.put(e, a);
            }
            return a;
        }
        return 0;
    }

    public final void c() {
        this.a.clear();
    }
}
