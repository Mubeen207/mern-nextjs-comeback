package androidx.appcompat.view.menu;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
/* loaded from: classes.dex */
public abstract class ia {
    public final int a;

    /* loaded from: classes.dex */
    public class a extends ia {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // androidx.appcompat.view.menu.ia
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.appcompat.view.menu.ia
        public int e() {
            return this.b.b0();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int f() {
            return e();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int g() {
            return this.b.j0();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int h() {
            return this.b.u0() - this.b.k0();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int i() {
            return j();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int j() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.ia
        public void k(View view, int i, int i2) {
            this.b.F0(view, g(), i, h(), i2);
        }

        @Override // androidx.appcompat.view.menu.ia
        public void l(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }
    }

    /* loaded from: classes.dex */
    public class b extends ia {
        public final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // androidx.appcompat.view.menu.ia
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
        }

        @Override // androidx.appcompat.view.menu.ia
        public int e() {
            return this.b.b0() - this.b.h0();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int f() {
            return this.b.E2() ? g() : h();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int g() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.ia
        public int h() {
            return this.b.u0();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int i() {
            return this.b.E2() ? h() : g();
        }

        @Override // androidx.appcompat.view.menu.ia
        public int j() {
            return this.b.m0();
        }

        @Override // androidx.appcompat.view.menu.ia
        public void k(View view, int i, int i2) {
            this.b.F0(view, i, j(), i2, e());
        }

        @Override // androidx.appcompat.view.menu.ia
        public void l(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }
    }

    public /* synthetic */ ia(int i, a aVar) {
        this(i);
    }

    public static ia a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static ia b(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i != 0) {
            if (i == 1) {
                return c(carouselLayoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(carouselLayoutManager);
    }

    public static ia c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract float d(RecyclerView.p pVar);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract void k(View view, int i, int i2);

    public abstract void l(View view, Rect rect, float f, float f2);

    public ia(int i) {
        this.a = i;
    }
}
