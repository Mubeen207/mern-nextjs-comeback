package androidx.recyclerview.widget;

import androidx.appcompat.view.menu.r11;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class e implements Runnable {
    public static final ThreadLocal q = new ThreadLocal();
    public static Comparator r = new a();
    public long n;
    public long o;
    public ArrayList m = new ArrayList();
    public ArrayList p = new ArrayList();

    /* loaded from: classes.dex */
    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.m;
            if (recyclerView.l == null || oVar == null || !oVar.A0()) {
                return;
            }
            if (z) {
                if (!recyclerView.d.p()) {
                    oVar.u(recyclerView.l.c(), this);
                }
            } else if (!recyclerView.k0()) {
                oVar.t(this.a, this.b, recyclerView.g0, this);
            }
            int i = this.d;
            if (i > oVar.m) {
                oVar.m = i;
                oVar.n = z;
                recyclerView.b.K();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.e.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.c0 e0 = RecyclerView.e0(recyclerView.e.i(i2));
            if (e0.c == i && !e0.t()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.m.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.m.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.m.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f0.c(recyclerView, false);
                i += recyclerView.f0.d;
            }
        }
        this.p.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.m.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f0;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.p.size()) {
                        cVar = new c();
                        this.p.add(cVar);
                    } else {
                        cVar = (c) this.p.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.a = i6 <= abs;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.p, r);
    }

    public final void c(c cVar, long j) {
        RecyclerView.c0 i = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (i == null || i.b == null || !i.s() || i.t()) {
            return;
        }
        h((RecyclerView) i.b.get(), j);
    }

    public final void d(long j) {
        for (int i = 0; i < this.p.size(); i++) {
            c cVar = (c) this.p.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.n == 0) {
            this.n = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f0.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.C && recyclerView.e.j() != 0) {
            recyclerView.S0();
        }
        b bVar = recyclerView.f0;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                r11.a("RV Nested Prefetch");
                recyclerView.g0.f(recyclerView.l);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                r11.b();
            }
        }
    }

    public final RecyclerView.c0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.b;
        try {
            recyclerView.E0();
            RecyclerView.c0 I = uVar.I(i, false, j);
            if (I != null) {
                if (!I.s() || I.t()) {
                    uVar.a(I, false);
                } else {
                    uVar.B(I.a);
                }
            }
            recyclerView.G0(false);
            return I;
        } catch (Throwable th) {
            recyclerView.G0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.m.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            r11.a("RV Prefetch");
            if (!this.m.isEmpty()) {
                int size = this.m.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.m.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.o);
                    this.n = 0L;
                    r11.b();
                }
            }
        } finally {
            this.n = 0L;
            r11.b();
        }
    }
}
