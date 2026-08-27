package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.view.menu.aj;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.vm0;
import androidx.appcompat.view.menu.wd0;
import androidx.appcompat.view.menu.yi;
import androidx.appcompat.view.menu.ym0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.c;
/* loaded from: classes.dex */
public class f extends RecyclerView.g {
    public final com.google.android.material.datepicker.a c;
    public final c.m d;
    public final int e;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.a.getAdapter2().p(i)) {
                f.this.d.a(this.a.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.c0 {
        public final TextView t;
        public final MaterialCalendarGridView u;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(vm0.s);
            this.t = textView;
            p51.l0(textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(vm0.o);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public f(Context context, yi yiVar, com.google.android.material.datepicker.a aVar, aj ajVar, c.m mVar) {
        wd0 m = aVar.m();
        wd0 i = aVar.i();
        wd0 l = aVar.l();
        if (m.compareTo(l) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (l.compareTo(i) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.e = (e.e * c.s1(context)) + (d.B1(context) ? c.s1(context) : 0);
        this.c = aVar;
        this.d = mVar;
        r(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.c.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i) {
        return this.c.m().p(i).o();
    }

    public wd0 u(int i) {
        return this.c.m().p(i);
    }

    public CharSequence v(int i) {
        return u(i).n();
    }

    public int w(wd0 wd0Var) {
        return this.c.m().q(wd0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: x */
    public void i(b bVar, int i) {
        wd0 p = this.c.m().p(i);
        bVar.t.setText(p.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(vm0.o);
        if (materialCalendarGridView.getAdapter2() == null || !p.equals(materialCalendarGridView.getAdapter2().a)) {
            e eVar = new e(p, null, this.c, null);
            materialCalendarGridView.setNumColumns(p.p);
            materialCalendarGridView.setAdapter((ListAdapter) eVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: y */
    public b k(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ym0.m, viewGroup, false);
        if (d.B1(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}
