package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class f3 extends ImageView {
    public final u2 a;
    public final e3 b;
    public boolean c;

    public f3(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.b();
        }
        e3 e3Var = this.b;
        if (e3Var != null) {
            e3Var.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        u2 u2Var = this.a;
        if (u2Var != null) {
            return u2Var.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u2 u2Var = this.a;
        if (u2Var != null) {
            return u2Var.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e3 e3Var = this.b;
        if (e3Var != null) {
            return e3Var.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e3 e3Var = this.b;
        if (e3Var != null) {
            return e3Var.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e3 e3Var = this.b;
        if (e3Var != null) {
            e3Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e3 e3Var = this.b;
        if (e3Var != null && drawable != null && !this.c) {
            e3Var.h(drawable);
        }
        super.setImageDrawable(drawable);
        e3 e3Var2 = this.b;
        if (e3Var2 != null) {
            e3Var2.c();
            if (this.c) {
                return;
            }
            this.b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        e3 e3Var = this.b;
        if (e3Var != null) {
            e3Var.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e3 e3Var = this.b;
        if (e3Var != null) {
            e3Var.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u2 u2Var = this.a;
        if (u2Var != null) {
            u2Var.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        e3 e3Var = this.b;
        if (e3Var != null) {
            e3Var.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        e3 e3Var = this.b;
        if (e3Var != null) {
            e3Var.k(mode);
        }
    }

    public f3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f3(Context context, AttributeSet attributeSet, int i) {
        super(y01.b(context), attributeSet, i);
        this.c = false;
        j01.a(this, getContext());
        u2 u2Var = new u2(this);
        this.a = u2Var;
        u2Var.e(attributeSet, i);
        e3 e3Var = new e3(this);
        this.b = e3Var;
        e3Var.g(attributeSet, i);
    }
}
