package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* loaded from: classes.dex */
public final class k9 {
    public final j9 a;
    public final j9 b;
    public final j9 c;
    public final j9 d;
    public final j9 e;
    public final j9 f;
    public final j9 g;
    public final Paint h;

    public k9(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(jb0.d(context, cm0.p, com.google.android.material.datepicker.c.class.getCanonicalName()), on0.t2);
        this.a = j9.a(context, obtainStyledAttributes.getResourceId(on0.x2, 0));
        this.g = j9.a(context, obtainStyledAttributes.getResourceId(on0.v2, 0));
        this.b = j9.a(context, obtainStyledAttributes.getResourceId(on0.w2, 0));
        this.c = j9.a(context, obtainStyledAttributes.getResourceId(on0.y2, 0));
        ColorStateList a = qb0.a(context, obtainStyledAttributes, on0.z2);
        this.d = j9.a(context, obtainStyledAttributes.getResourceId(on0.B2, 0));
        this.e = j9.a(context, obtainStyledAttributes.getResourceId(on0.A2, 0));
        this.f = j9.a(context, obtainStyledAttributes.getResourceId(on0.C2, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
