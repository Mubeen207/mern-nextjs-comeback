package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* loaded from: classes.dex */
public class ra extends v11 {
    public static final String[] Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property Z = new b(PointF.class, "boundsOrigin");
    public static final Property a0 = new c(PointF.class, "topLeft");
    public static final Property b0 = new d(PointF.class, "bottomRight");
    public static final Property c0 = new e(PointF.class, "bottomRight");
    public static final Property d0 = new f(PointF.class, "topLeft");
    public static final Property e0 = new g(PointF.class, "position");
    public static bo0 f0 = new bo0();
    public int[] V = new int[2];
    public boolean W = false;
    public boolean X = false;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q61.b(this.a).d(this.b);
            q61.g(this.c, this.d);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property {
        public Rect a;

        public b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            q61.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            q61.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            q61.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds;

        public h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            p51.r0(this.b, this.c);
            q61.f(this.b, this.d, this.e, this.f, this.g);
        }
    }

    /* loaded from: classes.dex */
    public class j extends w11 {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public j(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void a(v11 v11Var) {
            z51.c(this.b, false);
            this.a = true;
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void b(v11 v11Var) {
            z51.c(this.b, false);
        }

        @Override // androidx.appcompat.view.menu.w11, androidx.appcompat.view.menu.v11.f
        public void d(v11 v11Var) {
            z51.c(this.b, true);
        }

        @Override // androidx.appcompat.view.menu.v11.f
        public void e(v11 v11Var) {
            if (!this.a) {
                z51.c(this.b, false);
            }
            v11Var.S(this);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            q61.f(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public String[] G() {
        return Y;
    }

    public final void f0(b21 b21Var) {
        View view = b21Var.b;
        if (!p51.O(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        b21Var.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        b21Var.a.put("android:changeBounds:parent", b21Var.b.getParent());
        if (this.X) {
            b21Var.b.getLocationInWindow(this.V);
            b21Var.a.put("android:changeBounds:windowX", Integer.valueOf(this.V[0]));
            b21Var.a.put("android:changeBounds:windowY", Integer.valueOf(this.V[1]));
        }
        if (this.W) {
            b21Var.a.put("android:changeBounds:clip", p51.q(view));
        }
    }

    @Override // androidx.appcompat.view.menu.v11
    public void g(b21 b21Var) {
        f0(b21Var);
    }

    public final boolean g0(View view, View view2) {
        if (this.X) {
            b21 w = w(view, true);
            if (w == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == w.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.v11
    public void j(b21 b21Var) {
        f0(b21Var);
    }

    @Override // androidx.appcompat.view.menu.v11
    public Animator q(ViewGroup viewGroup, b21 b21Var, b21 b21Var2) {
        int i2;
        View view;
        int i3;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (b21Var == null || b21Var2 == null) {
            return null;
        }
        Map map = b21Var.a;
        Map map2 = b21Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = b21Var2.b;
        if (!g0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) b21Var.a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) b21Var.a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) b21Var2.a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) b21Var2.a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.V);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c3 = q61.c(view2);
            q61.g(view2, 0.0f);
            q61.b(viewGroup).b(bitmapDrawable);
            vh0 y = y();
            int[] iArr = this.V;
            int i4 = iArr[0];
            int i5 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, wk0.a(Z, y.a(intValue - i4, intValue2 - i5, intValue3 - i4, intValue4 - i5)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c3));
            return ofPropertyValuesHolder;
        }
        Rect rect = (Rect) b21Var.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) b21Var2.a.get("android:changeBounds:bounds");
        int i6 = rect.left;
        int i7 = rect2.left;
        int i8 = rect.top;
        int i9 = rect2.top;
        int i10 = rect.right;
        int i11 = rect2.right;
        int i12 = rect.bottom;
        int i13 = rect2.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect3 = (Rect) b21Var.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) b21Var2.a.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i2 = 0;
        } else {
            i2 = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 > 0) {
            if (this.W) {
                view = view2;
                q61.f(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
                ObjectAnimator a2 = (i6 == i7 && i8 == i9) ? null : uf0.a(view, e0, y().a(i6, i8, i7, i9));
                if (rect3 == null) {
                    i3 = 0;
                    rect3 = new Rect(0, 0, i14, i15);
                } else {
                    i3 = 0;
                }
                Rect rect5 = rect4 == null ? new Rect(i3, i3, i16, i17) : rect4;
                if (rect3.equals(rect5)) {
                    objectAnimator = null;
                } else {
                    p51.r0(view, rect3);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", f0, rect3, rect5);
                    ofObject.addListener(new i(view, rect4, i7, i9, i11, i13));
                    objectAnimator = ofObject;
                }
                c2 = a21.c(a2, objectAnimator);
            } else {
                view = view2;
                q61.f(view, i6, i8, i10, i12);
                if (i2 != 2) {
                    c2 = (i6 == i7 && i8 == i9) ? uf0.a(view, c0, y().a(i10, i12, i11, i13)) : uf0.a(view, d0, y().a(i6, i8, i7, i9));
                } else if (i14 == i16 && i15 == i17) {
                    c2 = uf0.a(view, e0, y().a(i6, i8, i7, i9));
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a3 = uf0.a(kVar, a0, y().a(i6, i8, i7, i9));
                    ObjectAnimator a4 = uf0.a(kVar, b0, y().a(i10, i12, i11, i13));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a3, a4);
                    animatorSet.addListener(new h(kVar));
                    c2 = animatorSet;
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                z51.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return c2;
        }
        return null;
    }
}
