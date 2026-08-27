package androidx.appcompat.view.menu;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.rb0;
/* loaded from: classes.dex */
public abstract class mi extends rb0 {
    public b y;

    /* loaded from: classes.dex */
    public static class c extends mi {
        public c(b bVar) {
            super(bVar);
        }

        @Override // androidx.appcompat.view.menu.rb0
        public void r(Canvas canvas) {
            if (this.y.w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.y.w);
            super.r(canvas);
            canvas.restore();
        }
    }

    public static mi f0(b bVar) {
        return new c(bVar);
    }

    public static mi g0(vt0 vt0Var) {
        if (vt0Var == null) {
            vt0Var = new vt0();
        }
        return f0(new b(vt0Var, new RectF()));
    }

    public boolean h0() {
        return !this.y.w.isEmpty();
    }

    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void j0(float f, float f2, float f3, float f4) {
        if (f == this.y.w.left && f2 == this.y.w.top && f3 == this.y.w.right && f4 == this.y.w.bottom) {
            return;
        }
        this.y.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.appcompat.view.menu.rb0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.y = new b(this.y);
        return this;
    }

    /* loaded from: classes.dex */
    public static final class b extends rb0.c {
        public final RectF w;

        @Override // androidx.appcompat.view.menu.rb0.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            mi f0 = mi.f0(this);
            f0.invalidateSelf();
            return f0;
        }

        public b(vt0 vt0Var, RectF rectF) {
            super(vt0Var, null);
            this.w = rectF;
        }

        public b(b bVar) {
            super(bVar);
            this.w = bVar.w;
        }
    }

    public mi(b bVar) {
        super(bVar);
        this.y = bVar;
    }
}
