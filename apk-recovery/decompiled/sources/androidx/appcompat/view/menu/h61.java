package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
public class h61 implements i61 {
    public final ViewOverlay a;

    public h61(View view) {
        this.a = view.getOverlay();
    }

    @Override // androidx.appcompat.view.menu.i61
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // androidx.appcompat.view.menu.i61
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
