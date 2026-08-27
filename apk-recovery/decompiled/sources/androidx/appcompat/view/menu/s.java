package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class s {
    public u[] a;
    public int b;
    public int c;

    public final u d() {
        u uVar;
        synchronized (this) {
            try {
                u[] uVarArr = this.a;
                if (uVarArr == null) {
                    uVarArr = f(2);
                    this.a = uVarArr;
                } else if (this.b >= uVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(uVarArr, uVarArr.length * 2);
                    c60.d(copyOf, "copyOf(this, newSize)");
                    this.a = (u[]) copyOf;
                    uVarArr = (u[]) copyOf;
                }
                int i = this.c;
                do {
                    uVar = uVarArr[i];
                    if (uVar == null) {
                        uVar = e();
                        uVarArr[i] = uVar;
                    }
                    i++;
                    if (i >= uVarArr.length) {
                        i = 0;
                    }
                    c60.c(uVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!uVar.a(this));
                this.c = i;
                this.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public abstract u e();

    public abstract u[] f(int i);

    public final void g(u uVar) {
        int i;
        xg[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                if (i2 == 0) {
                    this.c = 0;
                }
                c60.c(uVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = uVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (xg xgVar : b) {
            if (xgVar != null) {
                qp0.a aVar = qp0.m;
                xgVar.n(qp0.a(u31.a));
            }
        }
    }

    public final u[] h() {
        return this.a;
    }
}
