package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
/* loaded from: classes.dex */
public class za1 extends RecyclerView.g {
    public final com.google.android.material.datepicker.c c;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.c0 {
        public final TextView t;

        public a(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    public za1(com.google.android.material.datepicker.c cVar) {
        this.c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.c.o1().n();
    }

    public int t(int i) {
        return i - this.c.o1().m().o;
    }

    public int u(int i) {
        return this.c.o1().m().o + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v */
    public void i(a aVar, int i) {
        int u = u(i);
        aVar.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(u)));
        TextView textView = aVar.t;
        textView.setContentDescription(zi.e(textView.getContext(), u));
        k9 p1 = this.c.p1();
        if (t41.g().get(1) == u) {
            j9 j9Var = p1.f;
        } else {
            j9 j9Var2 = p1.d;
        }
        this.c.r1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: w */
    public a k(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ym0.o, viewGroup, false));
    }
}
