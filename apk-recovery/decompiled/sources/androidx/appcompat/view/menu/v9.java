package androidx.appcompat.view.menu;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class v9 extends vz0 {
    public final Typeface a;
    public final a b;
    public boolean c;

    /* loaded from: classes.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public v9(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // androidx.appcompat.view.menu.vz0
    public void a(int i) {
        d(this.a);
    }

    @Override // androidx.appcompat.view.menu.vz0
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
