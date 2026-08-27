package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class fe0 extends ja {
    public static final int[] b = {1};
    public static final int[] c = {1, 0};
    public int a = 0;

    @Override // androidx.appcompat.view.menu.ja
    public com.google.android.material.carousel.b c(fa faVar, View view) {
        float c2 = faVar.c();
        if (faVar.f()) {
            c2 = faVar.a();
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (faVar.f()) {
            f = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float h = com.google.android.material.carousel.a.h(view.getContext()) + f2;
        float g = com.google.android.material.carousel.a.g(view.getContext()) + f2;
        float min = Math.min(measuredHeight + f2, c2);
        float a = xb0.a((measuredHeight / 3.0f) + f2, com.google.android.material.carousel.a.h(view.getContext()) + f2, com.google.android.material.carousel.a.g(view.getContext()) + f2);
        float f3 = (min + a) / 2.0f;
        int[] iArr = b;
        if (c2 < 2.0f * h) {
            iArr = new int[]{0};
        }
        int[] iArr2 = c;
        if (faVar.b() == 1) {
            iArr = ja.a(iArr);
            iArr2 = ja.a(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int ceil = (int) Math.ceil(c2 / min);
        int max = (ceil - ((int) Math.max(1.0d, Math.floor(((c2 - (com.google.android.material.carousel.a.i(iArr4) * f3)) - (com.google.android.material.carousel.a.i(iArr3) * g)) / min)))) + 1;
        int[] iArr5 = new int[max];
        for (int i = 0; i < max; i++) {
            iArr5[i] = ceil - i;
        }
        i4 c3 = i4.c(c2, a, h, g, iArr3, f3, iArr4, min, iArr5);
        this.a = c3.e();
        if (e(c3, faVar.e())) {
            c3 = i4.c(c2, a, h, g, new int[]{c3.c}, f3, new int[]{c3.d}, min, new int[]{c3.g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f2, c2, c3, faVar.b());
    }

    @Override // androidx.appcompat.view.menu.ja
    public boolean d(fa faVar, int i) {
        return (i < this.a && faVar.e() >= this.a) || (i >= this.a && faVar.e() < this.a);
    }

    public boolean e(i4 i4Var, int i) {
        int e = i4Var.e() - i;
        boolean z = e > 0 && (i4Var.c > 0 || i4Var.d > 1);
        while (e > 0) {
            int i2 = i4Var.c;
            if (i2 > 0) {
                i4Var.c = i2 - 1;
            } else {
                int i3 = i4Var.d;
                if (i3 > 1) {
                    i4Var.d = i3 - 1;
                }
            }
            e--;
        }
        return z;
    }
}
