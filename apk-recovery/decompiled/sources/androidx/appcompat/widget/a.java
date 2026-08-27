package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.c8;
import androidx.appcompat.view.menu.dm0;
import androidx.appcompat.view.menu.dv;
import androidx.appcompat.view.menu.dy0;
import androidx.appcompat.view.menu.f3;
import androidx.appcompat.view.menu.hu0;
import androidx.appcompat.view.menu.i11;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.pc0;
import androidx.appcompat.view.menu.tc0;
import androidx.appcompat.view.menu.vc0;
import androidx.appcompat.view.menu.w0;
import androidx.appcompat.view.menu.xc0;
import androidx.appcompat.view.menu.zc0;
import androidx.appcompat.view.menu.zm0;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a extends c8 {
    public b A;
    public final f B;
    public int C;
    public d j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public final SparseBooleanArray w;
    public e x;
    public C0035a y;
    public c z;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0035a extends vc0 {
        public C0035a(Context context, dy0 dy0Var, View view) {
            super(context, dy0Var, view, false, dm0.f);
            if (!((tc0) dy0Var.getItem()).k()) {
                View view2 = a.this.j;
                f(view2 == null ? (View) a.this.i : view2);
            }
            j(a.this.B);
        }

        @Override // androidx.appcompat.view.menu.vc0
        public void e() {
            a aVar = a.this;
            aVar.y = null;
            aVar.C = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public hu0 a() {
            C0035a c0035a = a.this.y;
            if (c0035a != null) {
                return c0035a.c();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public e m;

        public c(e eVar) {
            this.m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.c != null) {
                a.this.c.c();
            }
            View view = (View) a.this.i;
            if (view != null && view.getWindowToken() != null && this.m.m()) {
                a.this.x = this.m;
            }
            a.this.z = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends f3 implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0036a extends dv {
            public final /* synthetic */ a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0036a(View view, a aVar) {
                super(view);
                this.j = aVar;
            }

            @Override // androidx.appcompat.view.menu.dv
            public hu0 b() {
                e eVar = a.this.x;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.view.menu.dv
            public boolean c() {
                a.this.H();
                return true;
            }

            @Override // androidx.appcompat.view.menu.dv
            public boolean d() {
                a aVar = a.this;
                if (aVar.z != null) {
                    return false;
                }
                aVar.z();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, dm0.e);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            i11.a(this, getContentDescription());
            setOnTouchListener(new C0036a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.H();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                om.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends vc0 {
        public e(Context context, pc0 pc0Var, View view, boolean z) {
            super(context, pc0Var, view, z, dm0.f);
            h(8388613);
            j(a.this.B);
        }

        @Override // androidx.appcompat.view.menu.vc0
        public void e() {
            if (a.this.c != null) {
                a.this.c.close();
            }
            a.this.x = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    public class f implements xc0.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.xc0.a
        public void b(pc0 pc0Var, boolean z) {
            if (pc0Var instanceof dy0) {
                pc0Var.z().d(false);
            }
            xc0.a m = a.this.m();
            if (m != null) {
                m.b(pc0Var, z);
            }
        }

        @Override // androidx.appcompat.view.menu.xc0.a
        public boolean c(pc0 pc0Var) {
            if (pc0Var == a.this.c) {
                return false;
            }
            a.this.C = ((dy0) pc0Var).getItem().getItemId();
            xc0.a m = a.this.m();
            if (m != null) {
                return m.c(pc0Var);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, zm0.c, zm0.b);
        this.w = new SparseBooleanArray();
        this.B = new f();
    }

    public boolean A() {
        C0035a c0035a = this.y;
        if (c0035a != null) {
            c0035a.b();
            return true;
        }
        return false;
    }

    public boolean B() {
        e eVar = this.x;
        return eVar != null && eVar.d();
    }

    public void C(Configuration configuration) {
        if (!this.r) {
            this.q = w0.a(this.b).c();
        }
        pc0 pc0Var = this.c;
        if (pc0Var != null) {
            pc0Var.H(true);
        }
    }

    public void D(boolean z) {
        this.u = z;
    }

    public void E(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.E(this.c);
    }

    public void F(Drawable drawable) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.l = true;
        this.k = drawable;
    }

    public void G(boolean z) {
        this.m = z;
        this.n = true;
    }

    public boolean H() {
        pc0 pc0Var;
        if (!this.m || B() || (pc0Var = this.c) == null || this.i == null || this.z != null || pc0Var.v().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.c, this.j, true));
        this.z = cVar;
        ((View) this.i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.c8, androidx.appcompat.view.menu.xc0
    public void b(pc0 pc0Var, boolean z) {
        w();
        super.b(pc0Var, z);
    }

    @Override // androidx.appcompat.view.menu.c8, androidx.appcompat.view.menu.xc0
    public void c(Context context, pc0 pc0Var) {
        super.c(context, pc0Var);
        Resources resources = context.getResources();
        w0 a = w0.a(context);
        if (!this.n) {
            this.m = a.d();
        }
        if (!this.t) {
            this.o = a.b();
        }
        if (!this.r) {
            this.q = a.c();
        }
        int i = this.o;
        if (this.m) {
            if (this.j == null) {
                d dVar = new d(this.a);
                this.j = dVar;
                if (this.l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = i;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.c8
    public void d(tc0 tc0Var, zc0.a aVar) {
        aVar.d(tc0Var, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    @Override // androidx.appcompat.view.menu.c8, androidx.appcompat.view.menu.xc0
    public boolean e(dy0 dy0Var) {
        boolean z = false;
        if (dy0Var.hasVisibleItems()) {
            dy0 dy0Var2 = dy0Var;
            while (dy0Var2.X() != this.c) {
                dy0Var2 = (dy0) dy0Var2.X();
            }
            View x = x(dy0Var2.getItem());
            if (x == null) {
                return false;
            }
            this.C = dy0Var.getItem().getItemId();
            int size = dy0Var.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = dy0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            C0035a c0035a = new C0035a(this.b, dy0Var, x);
            this.y = c0035a;
            c0035a.g(z);
            this.y.k();
            super.e(dy0Var);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.c8, androidx.appcompat.view.menu.xc0
    public void f(boolean z) {
        int size;
        super.f(z);
        ((View) this.i).requestLayout();
        pc0 pc0Var = this.c;
        if (pc0Var != null) {
            ArrayList r = pc0Var.r();
            int size2 = r.size();
            for (int i = 0; i < size2; i++) {
                ((tc0) r.get(i)).g();
            }
        }
        pc0 pc0Var2 = this.c;
        ArrayList v = pc0Var2 != null ? pc0Var2.v() : null;
        if (!this.m || v == null || ((size = v.size()) != 1 ? size <= 0 : !(!((tc0) v.get(0)).isActionViewExpanded()))) {
            d dVar = this.j;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                zc0 zc0Var = this.i;
                if (parent == zc0Var) {
                    ((ViewGroup) zc0Var).removeView(this.j);
                }
            }
        } else {
            if (this.j == null) {
                this.j = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.j, actionMenuView.C());
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.xc0
    public boolean g() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        a aVar = this;
        pc0 pc0Var = aVar.c;
        View view = null;
        ?? r3 = 0;
        if (pc0Var != null) {
            arrayList = pc0Var.A();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = aVar.q;
        int i6 = aVar.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.i;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            tc0 tc0Var = (tc0) arrayList.get(i9);
            if (tc0Var.n()) {
                i7++;
            } else if (tc0Var.m()) {
                i8++;
            } else {
                z2 = true;
            }
            if (aVar.u && tc0Var.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (aVar.m && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = aVar.w;
        sparseBooleanArray.clear();
        if (aVar.s) {
            int i11 = aVar.v;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            tc0 tc0Var2 = (tc0) arrayList.get(i12);
            if (tc0Var2.n()) {
                View n = aVar.n(tc0Var2, view, viewGroup);
                if (aVar.s) {
                    i3 -= ActionMenuView.G(n, i2, i3, makeMeasureSpec, r3);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = tc0Var2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                tc0Var2.t(true);
                z = r3;
                i4 = i;
            } else if (tc0Var2.m()) {
                int groupId2 = tc0Var2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!aVar.s || i3 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View n2 = aVar.n(tc0Var2, null, viewGroup);
                    if (aVar.s) {
                        int G = ActionMenuView.G(n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= G;
                        if (G == 0) {
                            z5 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!aVar.s ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        tc0 tc0Var3 = (tc0) arrayList.get(i14);
                        if (tc0Var3.getGroupId() == groupId2) {
                            if (tc0Var3.k()) {
                                i10++;
                            }
                            tc0Var3.t(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                tc0Var2.t(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                tc0Var2.t(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            aVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.c8
    public boolean l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.j) {
            return false;
        }
        return super.l(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.c8
    public View n(tc0 tc0Var, View view, ViewGroup viewGroup) {
        View actionView = tc0Var.getActionView();
        if (actionView == null || tc0Var.i()) {
            actionView = super.n(tc0Var, view, viewGroup);
        }
        actionView.setVisibility(tc0Var.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.c8
    public boolean o(int i, tc0 tc0Var) {
        return tc0Var.k();
    }

    public boolean w() {
        return z() | A();
    }

    public final View x(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof zc0.a) && ((zc0.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable y() {
        d dVar = this.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.l) {
            return this.k;
        }
        return null;
    }

    public boolean z() {
        zc0 zc0Var;
        c cVar = this.z;
        if (cVar != null && (zc0Var = this.i) != null) {
            ((View) zc0Var).removeCallbacks(cVar);
            this.z = null;
            return true;
        }
        e eVar = this.x;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }
}
