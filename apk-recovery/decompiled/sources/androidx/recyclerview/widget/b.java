package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public final InterfaceC0053b a;
    public final a b = new a();
    public final List c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {
        public long a = 0;
        public a b;

        public void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public int b(int i) {
            a aVar = this.b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.a);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
                return;
            }
            c();
            this.b.h(i - 64);
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0053b {
        View a(int i);

        void b(View view);

        RecyclerView.c0 c(View view);

        void d(int i);

        void e(View view);

        void f(View view, int i);

        int g();

        void h(int i);

        void i();

        void j(View view, int i, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    public b(InterfaceC0053b interfaceC0053b) {
        this.a = interfaceC0053b;
    }

    public void a(View view, int i, boolean z) {
        int g = i < 0 ? this.a.g() : h(i);
        this.b.e(g, z);
        if (z) {
            l(view);
        }
        this.a.f(view, g);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int g = i < 0 ? this.a.g() : h(i);
        this.b.e(g, z);
        if (z) {
            l(view);
        }
        this.a.j(view, g, layoutParams);
    }

    public void d(int i) {
        int h = h(i);
        this.b.f(h);
        this.a.d(h);
    }

    public View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.c.get(i2);
            RecyclerView.c0 c = this.a.c(view);
            if (c.m() == i && !c.t() && !c.v()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.a.a(h(i));
    }

    public int g() {
        return this.a.g() - this.c.size();
    }

    public final int h(int i) {
        if (i < 0) {
            return -1;
        }
        int g = this.a.g();
        int i2 = i;
        while (i2 < g) {
            int b = i - (i2 - this.b.b(i2));
            if (b == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public View i(int i) {
        return this.a.a(i);
    }

    public int j() {
        return this.a.g();
    }

    public void k(View view) {
        int k = this.a.k(view);
        if (k >= 0) {
            this.b.h(k);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    public int m(View view) {
        int k = this.a.k(view);
        if (k == -1 || this.b.d(k)) {
            return -1;
        }
        return k - this.b.b(k);
    }

    public boolean n(View view) {
        return this.c.contains(view);
    }

    public void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.e((View) this.c.get(size));
            this.c.remove(size);
        }
        this.a.i();
    }

    public void p(View view) {
        int k = this.a.k(view);
        if (k < 0) {
            return;
        }
        if (this.b.f(k)) {
            t(view);
        }
        this.a.h(k);
    }

    public void q(int i) {
        int h = h(i);
        View a2 = this.a.a(h);
        if (a2 == null) {
            return;
        }
        if (this.b.f(h)) {
            t(a2);
        }
        this.a.h(h);
    }

    public boolean r(View view) {
        int k = this.a.k(view);
        if (k == -1) {
            t(view);
            return true;
        } else if (this.b.d(k)) {
            this.b.f(k);
            t(view);
            this.a.h(k);
            return true;
        } else {
            return false;
        }
    }

    public void s(View view) {
        int k = this.a.k(view);
        if (k < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.b.d(k)) {
            this.b.a(k);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (this.c.remove(view)) {
            this.a.e(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
