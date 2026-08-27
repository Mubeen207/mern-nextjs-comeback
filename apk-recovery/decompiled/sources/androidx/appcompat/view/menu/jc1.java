package androidx.appcompat.view.menu;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class jc1 implements jg0 {
    public final gy a;
    public final int b;
    public final r2 c;
    public final long d;
    public final long e;

    public jc1(gy gyVar, int i, r2 r2Var, long j, long j2, String str, String str2) {
        this.a = gyVar;
        this.b = i;
        this.c = r2Var;
        this.d = j;
        this.e = j2;
    }

    public static jc1 b(gy gyVar, int i, r2 r2Var) {
        boolean z;
        if (gyVar.f()) {
            yp0 a = xp0.b().a();
            if (a == null) {
                z = true;
            } else if (!a.i()) {
                return null;
            } else {
                z = a.k();
                wb1 w = gyVar.w(r2Var);
                if (w != null) {
                    if (!(w.u() instanceof z7)) {
                        return null;
                    }
                    z7 z7Var = (z7) w.u();
                    if (z7Var.J() && !z7Var.f()) {
                        ff c = c(w, z7Var, i);
                        if (c == null) {
                            return null;
                        }
                        w.F();
                        z = c.n();
                    }
                }
            }
            return new jc1(gyVar, i, r2Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    public static ff c(wb1 wb1Var, z7 z7Var, int i) {
        int[] f;
        int[] i2;
        ff H = z7Var.H();
        if (H == null || !H.k() || ((f = H.f()) != null ? !s4.a(f, i) : !((i2 = H.i()) == null || !s4.a(i2, i))) || wb1Var.s() >= H.d()) {
            return null;
        }
        return H;
    }

    @Override // androidx.appcompat.view.menu.jg0
    public final void a(cz0 cz0Var) {
        wb1 w;
        int i;
        int i2;
        int i3;
        int d;
        long j;
        long j2;
        int i4;
        if (this.a.f()) {
            yp0 a = xp0.b().a();
            if ((a == null || a.i()) && (w = this.a.w(this.c)) != null && (w.u() instanceof z7)) {
                z7 z7Var = (z7) w.u();
                boolean z = true;
                int i5 = 0;
                boolean z2 = this.d > 0;
                int z3 = z7Var.z();
                if (a != null) {
                    z2 &= a.k();
                    int d2 = a.d();
                    int f = a.f();
                    i = a.n();
                    if (z7Var.J() && !z7Var.f()) {
                        ff c = c(w, z7Var, this.b);
                        if (c == null) {
                            return;
                        }
                        if (!c.n() || this.d <= 0) {
                            z = false;
                        }
                        f = c.d();
                        z2 = z;
                    }
                    i3 = d2;
                    i2 = f;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                gy gyVar = this.a;
                if (cz0Var.m()) {
                    d = 0;
                } else {
                    if (cz0Var.k()) {
                        i5 = 100;
                    } else {
                        Exception h = cz0Var.h();
                        if (h instanceof o2) {
                            Status a2 = ((o2) h).a();
                            int f2 = a2.f();
                            ef d3 = a2.d();
                            d = d3 == null ? -1 : d3.d();
                            i5 = f2;
                        } else {
                            i5 = 101;
                        }
                    }
                    d = -1;
                }
                if (z2) {
                    long j3 = this.d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 = (int) (SystemClock.elapsedRealtime() - this.e);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    i4 = -1;
                }
                gyVar.E(new qd0(this.b, i5, d, j, j2, null, null, z3, i4), i, i3, i2);
            }
        }
    }
}
