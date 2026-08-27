package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class j extends n {
    public i d;
    public i e;

    /* loaded from: classes.dex */
    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.y
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] c = jVar.c(jVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.p()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.q()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public g e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View g(RecyclerView.o oVar) {
        if (oVar.q()) {
            return m(oVar, p(oVar));
        }
        if (oVar.p()) {
            return m(oVar, n(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int h(RecyclerView.o oVar, int i, int i2) {
        i o;
        int e = oVar.e();
        if (e == 0 || (o = o(oVar)) == null) {
            return -1;
        }
        int O = oVar.O();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < O; i5++) {
            View N = oVar.N(i5);
            if (N != null) {
                int l = l(oVar, N, o);
                if (l <= 0 && l > i4) {
                    view2 = N;
                    i4 = l;
                }
                if (l >= 0 && l < i3) {
                    view = N;
                    i3 = l;
                }
            }
        }
        boolean q = q(oVar, i, i2);
        if (!q || view == null) {
            if (q || view2 == null) {
                if (q) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int n0 = oVar.n0(view) + (r(oVar) == q ? -1 : 1);
                if (n0 < 0 || n0 >= e) {
                    return -1;
                }
                return n0;
            }
            return oVar.n0(view2);
        }
        return oVar.n0(view);
    }

    public final int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    public final View m(RecyclerView.o oVar, i iVar) {
        int O = oVar.O();
        View view = null;
        if (O == 0) {
            return null;
        }
        int m = iVar.m() + (iVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < O; i2++) {
            View N = oVar.N(i2);
            int abs = Math.abs((iVar.g(N) + (iVar.e(N) / 2)) - m);
            if (abs < i) {
                view = N;
                i = abs;
            }
        }
        return view;
    }

    public final i n(RecyclerView.o oVar) {
        i iVar = this.e;
        if (iVar == null || iVar.a != oVar) {
            this.e = i.a(oVar);
        }
        return this.e;
    }

    public final i o(RecyclerView.o oVar) {
        if (oVar.q()) {
            return p(oVar);
        }
        if (oVar.p()) {
            return n(oVar);
        }
        return null;
    }

    public final i p(RecyclerView.o oVar) {
        i iVar = this.d;
        if (iVar == null || iVar.a != oVar) {
            this.d = i.c(oVar);
        }
        return this.d;
    }

    public final boolean q(RecyclerView.o oVar, int i, int i2) {
        return oVar.p() ? i > 0 : i2 > 0;
    }

    public final boolean r(RecyclerView.o oVar) {
        PointF d;
        int e = oVar.e();
        if (!(oVar instanceof RecyclerView.y.b) || (d = ((RecyclerView.y.b) oVar).d(e - 1)) == null) {
            return false;
        }
        return d.x < 0.0f || d.y < 0.0f;
    }
}
