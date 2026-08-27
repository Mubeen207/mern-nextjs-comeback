package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.b11;
import androidx.appcompat.view.menu.dm0;
import androidx.appcompat.view.menu.fn0;
import androidx.appcompat.view.menu.i3;
import androidx.appcompat.view.menu.jj;
import androidx.appcompat.view.menu.mm0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.pn0;
import androidx.appcompat.view.menu.x0;
/* loaded from: classes.dex */
public class d implements jj {
    public Toolbar a;
    public int b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public boolean l;
    public int m;
    public int n;
    public Drawable o;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final x0 a;

        public a() {
            this.a = new x0(d.this.a.getContext(), 0, 16908332, 0, 0, d.this.h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.k;
            if (callback == null || !dVar.l) {
                return;
            }
            callback.onMenuItemSelected(0, this.a);
        }
    }

    public d(Toolbar toolbar, boolean z) {
        this(toolbar, z, fn0.a, mm0.n);
    }

    @Override // androidx.appcompat.view.menu.jj
    public void a(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        o(charSequence);
    }

    @Override // androidx.appcompat.view.menu.jj
    public void b(Window.Callback callback) {
        this.k = callback;
    }

    @Override // androidx.appcompat.view.menu.jj
    public void c(int i) {
        i(i != 0 ? i3.b(e(), i) : null);
    }

    public final int d() {
        if (this.a.getNavigationIcon() != null) {
            this.o = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public Context e() {
        return this.a.getContext();
    }

    public void f(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void g(int i) {
        if (i == this.n) {
            return;
        }
        this.n = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            j(this.n);
        }
    }

    @Override // androidx.appcompat.view.menu.jj
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public void h(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.h);
                    this.a.setSubtitle(this.i);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public void i(Drawable drawable) {
        this.e = drawable;
        r();
    }

    public void j(int i) {
        k(i == 0 ? null : e().getString(i));
    }

    public void k(CharSequence charSequence) {
        this.j = charSequence;
        p();
    }

    public void l(Drawable drawable) {
        this.f = drawable;
        q();
    }

    public void m(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void n(CharSequence charSequence) {
        this.g = true;
        o(charSequence);
    }

    public final void o(CharSequence charSequence) {
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.g) {
                p51.n0(this.a.getRootView(), charSequence);
            }
        }
    }

    public final void p() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                this.a.setNavigationContentDescription(this.n);
            } else {
                this.a.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void q() {
        if ((this.b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.f;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void r() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // androidx.appcompat.view.menu.jj
    public void setIcon(int i) {
        setIcon(i != 0 ? i3.b(e(), i) : null);
    }

    public d(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.m = 0;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        b11 t = b11.t(toolbar.getContext(), null, pn0.a, dm0.c, 0);
        this.o = t.g(pn0.j);
        if (z) {
            CharSequence o = t.o(pn0.p);
            if (!TextUtils.isEmpty(o)) {
                n(o);
            }
            CharSequence o2 = t.o(pn0.n);
            if (!TextUtils.isEmpty(o2)) {
                m(o2);
            }
            Drawable g = t.g(pn0.l);
            if (g != null) {
                i(g);
            }
            Drawable g2 = t.g(pn0.k);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                l(drawable);
            }
            h(t.j(pn0.h, 0));
            int m = t.m(pn0.g, 0);
            if (m != 0) {
                f(LayoutInflater.from(this.a.getContext()).inflate(m, (ViewGroup) this.a, false));
                h(this.b | 16);
            }
            int l = t.l(pn0.i, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = l;
                this.a.setLayoutParams(layoutParams);
            }
            int e = t.e(pn0.f, -1);
            int e2 = t.e(pn0.e, -1);
            if (e >= 0 || e2 >= 0) {
                this.a.F(Math.max(e, 0), Math.max(e2, 0));
            }
            int m2 = t.m(pn0.q, 0);
            if (m2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.H(toolbar2.getContext(), m2);
            }
            int m3 = t.m(pn0.o, 0);
            if (m3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.G(toolbar3.getContext(), m3);
            }
            int m4 = t.m(pn0.m, 0);
            if (m4 != 0) {
                this.a.setPopupTheme(m4);
            }
        } else {
            this.b = d();
        }
        t.v();
        g(i);
        this.j = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.view.menu.jj
    public void setIcon(Drawable drawable) {
        this.d = drawable;
        r();
    }
}
