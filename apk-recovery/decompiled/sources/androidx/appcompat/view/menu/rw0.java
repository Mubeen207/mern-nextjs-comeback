package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.xc0;
/* loaded from: classes.dex */
public final class rw0 extends uc0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int v = zm0.j;
    public final Context b;
    public final pc0 c;
    public final oc0 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final wc0 i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public xc0.a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public int t = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!rw0.this.i() || rw0.this.i.n()) {
                return;
            }
            View view = rw0.this.n;
            if (view == null || !view.isShown()) {
                rw0.this.dismiss();
            } else {
                rw0.this.i.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = rw0.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    rw0.this.p = view.getViewTreeObserver();
                }
                rw0 rw0Var = rw0.this;
                rw0Var.p.removeGlobalOnLayoutListener(rw0Var.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public rw0(Context context, pc0 pc0Var, View view, int i, int i2, boolean z) {
        this.b = context;
        this.c = pc0Var;
        this.e = z;
        this.d = new oc0(pc0Var, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(im0.b));
        this.m = view;
        this.i = new wc0(context, null, i, i2);
        pc0Var.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.hu0
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void b(pc0 pc0Var, boolean z) {
        if (pc0Var != this.c) {
            return;
        }
        dismiss();
        xc0.a aVar = this.o;
        if (aVar != null) {
            aVar.b(pc0Var, z);
        }
    }

    @Override // androidx.appcompat.view.menu.hu0
    public ListView d() {
        return this.i.d();
    }

    @Override // androidx.appcompat.view.menu.hu0
    public void dismiss() {
        if (i()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean e(dy0 dy0Var) {
        if (dy0Var.hasVisibleItems()) {
            vc0 vc0Var = new vc0(this.b, dy0Var, this.n, this.e, this.g, this.h);
            vc0Var.j(this.o);
            vc0Var.g(uc0.x(dy0Var));
            vc0Var.i(this.l);
            this.l = null;
            this.c.d(false);
            int j = this.i.j();
            int l = this.i.l();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                j += this.m.getWidth();
            }
            if (vc0Var.n(j, l)) {
                xc0.a aVar = this.o;
                if (aVar != null) {
                    aVar.c(dy0Var);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void f(boolean z) {
        this.r = false;
        oc0 oc0Var = this.d;
        if (oc0Var != null) {
            oc0Var.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.hu0
    public boolean i() {
        return !this.q && this.i.i();
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void k(xc0.a aVar) {
        this.o = aVar;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void l(pc0 pc0Var) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void p(View view) {
        this.m = view;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void r(boolean z) {
        this.d.d(z);
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void s(int i) {
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void t(int i) {
        this.i.v(i);
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void v(boolean z) {
        this.u = z;
    }

    @Override // androidx.appcompat.view.menu.uc0
    public void w(int i) {
        this.i.C(i);
    }

    public final boolean z() {
        View view;
        if (i()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.y(this);
        this.i.z(this);
        this.i.x(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.q(view2);
        this.i.t(this.t);
        if (!this.r) {
            this.s = uc0.o(this.d, null, this.b, this.f);
            this.r = true;
        }
        this.i.s(this.s);
        this.i.w(2);
        this.i.u(n());
        this.i.a();
        ListView d = this.i.d();
        d.setOnKeyListener(this);
        if (this.u && this.c.u() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(zm0.i, (ViewGroup) d, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.c.u());
            }
            frameLayout.setEnabled(false);
            d.addHeaderView(frameLayout, null, false);
        }
        this.i.p(this.d);
        this.i.a();
        return true;
    }
}
