package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.view.menu.aj;
import androidx.appcompat.view.menu.j9;
import androidx.appcompat.view.menu.k9;
import androidx.appcompat.view.menu.t41;
import androidx.appcompat.view.menu.wd0;
import androidx.appcompat.view.menu.yi;
import androidx.appcompat.view.menu.zi;
import java.util.Collection;
/* loaded from: classes.dex */
public class e extends BaseAdapter {
    public static final int e = t41.i().getMaximum(4);
    public static final int f = (t41.i().getMaximum(5) + t41.i().getMaximum(7)) - 1;
    public final wd0 a;
    public Collection b;
    public k9 c;
    public final a d;

    public e(wd0 wd0Var, yi yiVar, a aVar, aj ajVar) {
        this.a = wd0Var;
        this.d = aVar;
        this.b = yiVar.h();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.a.k(this.d.j());
    }

    public final String c(Context context, long j) {
        return zi.a(context, j, j(j), i(j), g(j));
    }

    @Override // android.widget.Adapter
    /* renamed from: d */
    public Long getItem(int i) {
        if (i < b() || i > k()) {
            return null;
        }
        return Long.valueOf(this.a.l(l(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = androidx.appcompat.view.menu.ym0.j
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            androidx.appcompat.view.menu.wd0 r8 = r5.a
            int r2 = r8.q
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void f(Context context) {
        if (this.c == null) {
            this.c = new k9(context);
        }
    }

    public boolean g(long j) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.a.p;
    }

    public final boolean h(long j) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(long j) {
        throw null;
    }

    public final boolean j(long j) {
        return t41.g().getTimeInMillis() == j;
    }

    public int k() {
        return (b() + this.a.q) - 1;
    }

    public int l(int i) {
        return (i - b()) + 1;
    }

    public final void m(TextView textView, long j, int i) {
        j9 j9Var;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j));
        if (this.d.f().g(j)) {
            textView.setEnabled(true);
            boolean h = h(j);
            textView.setSelected(h);
            j9Var = h ? this.c.b : j(j) ? this.c.c : this.c.a;
        } else {
            textView.setEnabled(false);
            j9Var = this.c.g;
        }
        j9Var.b(textView);
    }

    public final void n(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (wd0.i(j).equals(this.a)) {
            int m = this.a.m(j);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(m) - materialCalendarGridView.getFirstVisiblePosition()), j, m);
        }
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.b) {
            n(materialCalendarGridView, l.longValue());
        }
    }

    public boolean p(int i) {
        return i >= b() && i <= k();
    }
}
