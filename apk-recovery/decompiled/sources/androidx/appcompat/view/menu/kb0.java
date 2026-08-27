package androidx.appcompat.view.menu;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
/* loaded from: classes.dex */
public abstract class kb0 {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;

    public kb0(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = ce0.g(context, cm0.B, uh0.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = ce0.f(context, cm0.t, 300);
        this.d = ce0.f(context, cm0.w, 150);
        this.e = ce0.f(context, cm0.v, 100);
    }
}
