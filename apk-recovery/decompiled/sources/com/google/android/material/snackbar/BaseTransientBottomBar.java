package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.j2;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.ob0;
import androidx.appcompat.view.menu.om;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.p61;
import androidx.appcompat.view.menu.qb0;
import androidx.appcompat.view.menu.rb0;
import androidx.appcompat.view.menu.vb0;
import androidx.appcompat.view.menu.vt0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar {
    public static final TimeInterpolator a = j2.b;
    public static final TimeInterpolator b = j2.a;
    public static final TimeInterpolator c = j2.d;
    public static final boolean e = false;
    public static final int[] f = {cm0.D};
    public static final String g = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler d = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final b k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                my0.a(message.obj);
                throw null;
            } else if (i != 1) {
                return false;
            } else {
                my0.a(message.obj);
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FrameLayout {
        public static final View.OnTouchListener k = new a();
        public vt0 a;
        public int b;
        public final float c;
        public final float d;
        public final int e;
        public final int f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public boolean j;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(vb0.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, on0.e4);
            if (obtainStyledAttributes.hasValue(on0.l4)) {
                p51.s0(this, obtainStyledAttributes.getDimensionPixelSize(on0.l4, 0));
            }
            this.b = obtainStyledAttributes.getInt(on0.h4, 0);
            if (obtainStyledAttributes.hasValue(on0.n4) || obtainStyledAttributes.hasValue(on0.o4)) {
                this.a = vt0.e(context2, attributeSet, 0, 0).m();
            }
            this.c = obtainStyledAttributes.getFloat(on0.i4, 1.0f);
            setBackgroundTintList(qb0.a(context2, obtainStyledAttributes, on0.j4));
            setBackgroundTintMode(p61.i(obtainStyledAttributes.getInt(on0.k4, -1), PorterDuff.Mode.SRC_IN));
            this.d = obtainStyledAttributes.getFloat(on0.g4, 1.0f);
            this.e = obtainStyledAttributes.getDimensionPixelSize(on0.f4, -1);
            this.f = obtainStyledAttributes.getDimensionPixelSize(on0.m4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(k);
            setFocusable(true);
            if (getBackground() == null) {
                p51.o0(this, a());
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public final Drawable a() {
            int k2 = ob0.k(this, cm0.h, cm0.e, getBackgroundOverlayColorAlpha());
            vt0 vt0Var = this.a;
            Drawable d = vt0Var != null ? BaseTransientBottomBar.d(k2, vt0Var) : BaseTransientBottomBar.c(k2, getResources());
            if (this.g != null) {
                Drawable l = om.l(d);
                om.i(l, this.g);
                return l;
            }
            return om.l(d);
        }

        public final void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.d;
        }

        public int getAnimationMode() {
            return this.b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.c;
        }

        public int getMaxInlineActionWidth() {
            return this.f;
        }

        public int getMaxWidth() {
            return this.e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            p51.h0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.e;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.b = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.g != null) {
                drawable = om.l(drawable.mutate());
                om.i(drawable, this.g);
                om.j(drawable, this.h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.g = colorStateList;
            if (getBackground() != null) {
                Drawable l = om.l(getBackground().mutate());
                om.i(l, colorStateList);
                om.j(l, this.h);
                if (l != getBackground()) {
                    super.setBackgroundDrawable(l);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.h = mode;
            if (getBackground() != null) {
                Drawable l = om.l(getBackground().mutate());
                om.j(l, mode);
                if (l != getBackground()) {
                    super.setBackgroundDrawable(l);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : k);
            super.setOnClickListener(onClickListener);
        }
    }

    public static GradientDrawable c(int i, Resources resources) {
        float dimension = resources.getDimension(hm0.T);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static rb0 d(int i, vt0 vt0Var) {
        rb0 rb0Var = new rb0(vt0Var);
        rb0Var.T(ColorStateList.valueOf(i));
        return rb0Var;
    }
}
