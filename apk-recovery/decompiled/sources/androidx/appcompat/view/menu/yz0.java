package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class yz0 {
    public float c;
    public float d;
    public tz0 g;
    public final TextPaint a = new TextPaint(1);
    public final vz0 b = new a();
    public boolean e = true;
    public WeakReference f = new WeakReference(null);

    /* loaded from: classes.dex */
    public class a extends vz0 {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.vz0
        public void a(int i) {
            yz0.this.e = true;
            b bVar = (b) yz0.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // androidx.appcompat.view.menu.vz0
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            yz0.this.e = true;
            b bVar = (b) yz0.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public yz0(b bVar) {
        i(bVar);
    }

    public final float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public tz0 e() {
        return this.g;
    }

    public TextPaint f() {
        return this.a;
    }

    public float g(String str) {
        if (this.e) {
            h(str);
            return this.c;
        }
        return this.c;
    }

    public final void h(String str) {
        this.c = d(str);
        this.d = c(str);
        this.e = false;
    }

    public void i(b bVar) {
        this.f = new WeakReference(bVar);
    }

    public void j(tz0 tz0Var, Context context) {
        if (this.g != tz0Var) {
            this.g = tz0Var;
            if (tz0Var != null) {
                tz0Var.o(context, this.a, this.b);
                b bVar = (b) this.f.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                tz0Var.n(context, this.a, this.b);
                this.e = true;
            }
            b bVar2 = (b) this.f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z) {
        this.e = z;
    }

    public void l(Context context) {
        this.g.n(context, this.a, this.b);
    }
}
