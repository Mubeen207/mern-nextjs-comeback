package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.xc0;
/* loaded from: classes.dex */
public class vc0 {
    public final Context a;
    public final pc0 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public xc0.a i;
    public uc0 j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            vc0.this.e();
        }
    }

    public vc0(Context context, pc0 pc0Var, View view, boolean z, int i) {
        this(context, pc0Var, view, z, i, 0);
    }

    public final uc0 a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        uc0 kaVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(im0.a) ? new ka(this.a, this.f, this.d, this.e, this.c) : new rw0(this.a, this.b, this.f, this.d, this.e, this.c);
        kaVar.l(this.b);
        kaVar.u(this.l);
        kaVar.p(this.f);
        kaVar.k(this.i);
        kaVar.r(this.h);
        kaVar.s(this.g);
        return kaVar;
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public uc0 c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        uc0 uc0Var = this.j;
        return uc0Var != null && uc0Var.i();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        uc0 uc0Var = this.j;
        if (uc0Var != null) {
            uc0Var.r(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(xc0.a aVar) {
        this.i = aVar;
        uc0 uc0Var = this.j;
        if (uc0Var != null) {
            uc0Var.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i, int i2, boolean z, boolean z2) {
        uc0 c = c();
        c.v(z2);
        if (z) {
            if ((my.b(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            c.t(i);
            c.w(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }

    public vc0(Context context, pc0 pc0Var, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = pc0Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
