package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class vp0 extends Drawable implements yt0 {
    public b a;

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {
        public rb0 a;
        public boolean b;

        public b(rb0 rb0Var) {
            this.a = rb0Var;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public vp0 newDrawable() {
            return new vp0(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (rb0) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public vp0 mutate() {
        this.a = new b(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.a;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b2 = wp0.b(iArr);
        b bVar = this.a;
        if (bVar.b != b2) {
            bVar.b = b2;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.view.menu.yt0
    public void setShapeAppearanceModel(vt0 vt0Var) {
        this.a.a.setShapeAppearanceModel(vt0Var);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.a.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }

    public vp0(vt0 vt0Var) {
        this(new b(new rb0(vt0Var)));
    }

    public vp0(b bVar) {
        this.a = bVar;
    }
}
