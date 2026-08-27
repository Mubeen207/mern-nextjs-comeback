package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
public class w51 implements x51 {
    public final ViewGroupOverlay a;

    public w51(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // androidx.appcompat.view.menu.x51
    public void a(View view) {
        this.a.add(view);
    }

    @Override // androidx.appcompat.view.menu.i61
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // androidx.appcompat.view.menu.x51
    public void c(View view) {
        this.a.remove(view);
    }

    @Override // androidx.appcompat.view.menu.i61
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
